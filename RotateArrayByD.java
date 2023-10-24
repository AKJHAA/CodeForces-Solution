public class RotateArrayByD
{
    public static void RotateArray(int[] arr,int d)
    {
        int n = arr.length;
        int temp[] = new int[n];
        for(int i =0;i<d;i++)
            temp[i] = arr[i];
        for(int i=d;i<n;i++)
            arr[i-d] = arr[i];
        for(int i=0;i<d;i++)
            arr[n-d+i] = temp[i];

    }
    public static void printArray(int []arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "   ");
        }
    }
    public static void main(String[] Abhijeet) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        RotateArray(arr,6);
        printArray(arr);

    }
}