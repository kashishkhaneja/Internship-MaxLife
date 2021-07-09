// Java program to sort a stack using a auxiliary stack.
import java.util.*;

class StackSorting
{
    public static Stack<Integer> stacksort(Stack<Integer> input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            int tmp = input.pop();
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp)  //If we need to get element of a specific position, we use PEEP.
            {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
    public static void main(String args[])
    {
        Stack<Integer> input = new Stack<Integer>();
        input.add(4);
        input.add(3);
        input.add(31);
        input.add(8);
        Stack<Integer> tmpStack=stacksort(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        }
    }
}

