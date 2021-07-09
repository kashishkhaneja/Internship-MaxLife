// Java code to illustrate  Vector's clone()

import java.util.*;

public class VectorClone {
    public static void main(String args[])
    {
        Vector<String> v = new Vector<String>();
        v.add("Hello");
        v.add("How");
        v.add("are");
        v.add("you?");
        System.out.println("Vector: " + v);

        // Creating another vector to copy
        Object copy_vector = v.clone();
        System.out.println("The cloned vector is: " + copy_vector);
    }
}
