// Vector Class in Java

import java.io.*;
import java.util.*;

class VectorExample {

    public static void main(String[] args)
    {
        int n = 10;
        Vector<Integer> v = new Vector<Integer> (n);
        for (int i = 1; i <= n; i++)
            v.add(i);
        System.out.println(v);
        v.remove(7);

        System.out.println(v);

        for (Integer integer : v) {
            System.out.println(integer + " ");
        }
    }
}
