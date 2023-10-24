//------------Abhijeet Kumar Jha CODE FORCES 800*-----------------//
import java.util.Scanner;
public class ArrivaloftheGeneral
{
    public static int Arrival(int[] arr,int n)
    {
        int max = Integer.MIN_VALUE;int maxIndex=0;
        //pehle max element nikalo phir uska index ko maxIndex me daallo
        for(int i=0;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                maxIndex = i;
            }
        }
        //ek ek kr ke maximum element ko first tak pahucha doo aur count1 ko increment kr do
        int count1 = 0;
        for(int i=maxIndex;i>0;i--)
        {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i-1];
            arr[i-1] = temp;
            count1++;maxIndex--;
        }
        //--------------------------------------------------------------------------//
        //phir minimum element nikalo then uska index ko minIndex me daallo
        int min = Integer.MAX_VALUE;int minIndex = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] <= min)
            {
                min = arr[i];
                minIndex = i;
            }
        }
        
        int count2 = 0;
        //ek ek kr ke minmum element ko last me pahucha doo aur count2 ko increment kr do
        for(int i = minIndex;i<n-1;i++)
        {
            int temp = arr[minIndex];
            arr[minIndex] = arr[i+1];
            arr[i+1] = temp;
            count2++;
            minIndex++;
        }
        //count1 aur count 2 ko add kr ke return kr do// **************khatm tata bye bye ************************
        return count1+count2;
    }
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        // System.out.println(arr[1]);
        System.out.println(Arrival(arr,arr.length));
    }
}