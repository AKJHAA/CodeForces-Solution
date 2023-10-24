public class RotateArrrayBy1
{
    public static void RotateArray(int[] arr)
    {
        int temp = arr[0];
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
    public static void printArray(int []arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "   ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        RotateArray(arr);
        printArray(arr);

    }
}