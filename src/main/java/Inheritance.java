// Inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    public void print_student()
    {
        System.out.println("Students");
    }
}

class two extends one {
    public void print_for() { System.out.println("for"); }
}
// Driver class
public class Inheritance {
    public static void main(String[] args)
    {
        two g = new two();
        g.print_student();
        g.print_for();
        g.print_student();
    }
}

