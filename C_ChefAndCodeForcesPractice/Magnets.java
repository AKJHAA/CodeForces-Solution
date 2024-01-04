import java.util.Scanner;
public class Magnets
{
    public static void main(String[] args) 
    {
        int a,count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a = sc.nextInt();
            if(a == 10)
                arr[i] = 1;
            else
                arr[i] = 0;
        }

        for(int i = 0;i<n-1;i++)
        {
            if(arr[i] != arr[i+1])
                count++;
        }
        System.out.println(count+1);
    }
}