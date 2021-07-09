// Java program to demonstrate encapsulation
class Encapsulate {

    private String MemberName;
    private int MemberRoll;
    private int MemberAge;

    public int getAge() {
        return MemberAge; }

    public String getName()
    {
        return MemberName;
    }

    public int getRoll() {
        return MemberRoll;
    }

    public void setAge(int newAge) {
        MemberAge = newAge; }

    public void setName(String newName)
    {
        MemberName = newName;
    }

    public void setRoll(int newRoll) { MemberRoll = newRoll; }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        obj.setName("Kashish");
        obj.setAge(20);
        obj.setRoll(28);

        System.out.println("Member's name: " + obj.getName());
        System.out.println("Member's age: " + obj.getAge());
        System.out.println("Member's roll: " + obj.getRoll());


    }
}

