import java.util.Scanner;
public class MovingNegativeInArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
            arr[i] = sc.nextInt();
        moveElement(arr,n);
        print(arr,n);
    }
    public static void moveElement(int[] arr,int n)
    {
        int j = 0;
        int temp;
        for(int i =0;i<n;i++)
        {
            if(arr[i] < 0)
            {
                if(i != j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void print(int[] arr,int n)
    {
        for(int i =0;i<n;i++)
            System.out.print(arr[i] + "  ");
    }
}