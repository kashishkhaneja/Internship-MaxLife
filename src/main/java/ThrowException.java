// Java program that demonstrates the use of throw in Exception Handling
class ThrowException
{ static void fun()
    { try
        { throw new NullPointerException("Hey");
        }
        catch(NullPointerException e)
        {System.out.println("Caught inside the function.");
            throw e;
        }
    }
    public static void main(String args[])
    { try
        { fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught");
        }
    }
}
