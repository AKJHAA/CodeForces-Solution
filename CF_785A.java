import java.util.Scanner;
public class CF_785A
{
    public static void main(String[] args)    
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String arr[] = new String[t];
        for(int i = 0;i<t;i++)
        {
            arr[i] = sc.next();
        }
        int Tetrahedron = 4;
        int Cube = 6;
        int Octahedron = 8;
        int Dodecahedron = 12;
        int Icosahedron = 20;
        int face = 0;
        for(int i = 0;i<t;i++)
        {
            if(arr[i].equals("Tetrahedron"))
                face = face + Tetrahedron;
            if(arr[i].equals("Cube"))
                face = face + Cube;
            if(arr[i].equals("Octahedron"))
                face = face + Octahedron;
            if(arr[i].equals("Dodecahedron"))
                face = face + Dodecahedron;
            if(arr[i].equals("Icosahedron"))
                face = face + Icosahedron;
        }
        System.out.println(face);
    }
}