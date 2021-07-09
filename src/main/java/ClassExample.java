class FirstClass
{
    int num;
    void setValue(int n)
    {
        num = n;
    }
    int getValue()
    {
        return num;
    }
}

class ClassExample
{
    public static void main(String[] args)
    {
        FirstClass f1;			//declaring the object
        f1 = new FirstClass();	//instantiating the object
        f1.setValue(5);
        System.out.println(f1.getValue());
    }
}