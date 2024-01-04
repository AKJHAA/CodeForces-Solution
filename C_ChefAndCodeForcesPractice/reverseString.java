public class reverseString
{
    public static void main(String[] args)
    {
        String str = "Abhijeet";
        String newStr = reverse(str);
        System.out.println(newStr);
    }
    public static String reverse(String str)
    {
        char arr[] = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while(start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // return new String(arr);
        return arr.toString();
    }
}