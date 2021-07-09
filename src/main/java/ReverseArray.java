//How To Reverse Integer Array In Java
import java.util.*;
    public class ReverseArray
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            int[] inputArray = {3,7,9,6,4};
            System.out.println("Array without reverse" +
                    Arrays.toString(inputArray));
            reverseArray(inputArray);
        }
        public static void reverseArray(int[] inputArray) {
            for (int left = 0, right = inputArray.length - 1;
                 left < right; left++, right--) {
                int temp = inputArray[left];
                inputArray[left]  = inputArray[right];
                inputArray[right] = temp;
            }
            System.out.print("Reverse Array :");
            for(int val : inputArray)
                System.out.print(" "+val);
        }
    }

