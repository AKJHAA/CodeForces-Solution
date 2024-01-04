class Student1
{
    int age;
    String name;
    String city;

    void printData()
    {
        System.out.println("\nName: " + name + "\nCity: " + city + "\nAge: " + age);
    }
}
public class LabEx1
{
    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.name = "Abhijeet Kumar Jha";
        s1.city = "Patna";
        s1.age = 22;
        s1.printData();

        s2.name = "Vishsant Tomar";
        s2.city = "Uttar Pradesh";
        s2.age = 25;
        s2.printData();
    }
}