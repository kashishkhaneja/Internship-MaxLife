//Write a program to find second largest element in a given Array in java

import java.util.*;
public class LargestSmallest
{
    public static void main(String[] args)
    {
        int inputArray[] = new int[] {10,43,27,98,75,59,191};
        Arrays.sort(inputArray);

        for(int i=0; i < inputArray.length; i++) {
            if(i == inputArray.length- 2)
                System.out.println(inputArray[i]);
        }
    }
}