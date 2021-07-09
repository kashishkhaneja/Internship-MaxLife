// parameterized constructor.
import java.io.*;

class Constructor
{
    String name;
    int id;

    // constructor would initialize data members
    // with the values of passed as arguments

    Constructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

class Construct
{
    public static void main (String[] args)
    {
        // this would invoke the parameterized constructor.
        Constructor student1 = new Constructor("Kashish", 1);
        System.out.println("StudentName :" + student1.name + " and StudentId :" + student1.id);
    }
}

