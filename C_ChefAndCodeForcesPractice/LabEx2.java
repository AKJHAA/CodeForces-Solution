class A
{
    void printData()
    {
        System.out.println("A Clasa PrintData Method");
    }
    void printData(String str)
    {
        System.out.println("Class A printData Method + " + str);
    }
}
class B
{
    void printData()
    {
        System.out.println("Class B PrintMethod");
    }
}
public class LabEx2
{
    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        a.printData();
        a.printData("Overinding");
        b.printData();
    }
}