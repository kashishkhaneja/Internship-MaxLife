//Remember: TreeSet uses tree data structure for storage.
//Objects are stored in sorted, ascending order. But we can iterate in descending order using method TreeSet.descendingIterator().

import java.util.*;

class treeset_iterator
{
    public static void main(String[] args)
    {
        TreeSet<String> ts = new TreeSet<String>();

        //value addition to tree set
        ts.add("E");
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("C");

        System.out.println("Tree set without Iterator: -"+ts);

        Iterator<String> itr = ts.iterator();
        System.out.println("\nAfter use of Iterator:-");
        while(itr.hasNext())
        {
            String s = itr.next();
            System.out.println(s+" ");
        }
        System.out.println();
    }
}
