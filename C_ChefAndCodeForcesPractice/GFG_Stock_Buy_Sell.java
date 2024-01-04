import java.util.*;
import java.io.*;
public class GFG_Stock_Buy_Sell
{
    public static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n)
    {
        ArrayList<ArrayList<Integer>>List = new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            ArrayList<Integer> list1=new ArrayList<>();
            if(A[i+1]>A[i])
            {
                list1.add(i);
                list1.add(i+1);
                List.add(list1);
            }
        }
        return List;
    }
    public static void main(String[] Abhijeet)
    {
        int arr[] = {100, 180, 260, 310, 40, 535, 695};
        int n = arr.length;
        ArrayList<ArrayList<Integer>> arr1 = stockBuySell(arr,n);
        System.out.println(arr1);
    }
}
