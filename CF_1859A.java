import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF_1859A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int max  =Integer.MIN_VALUE;
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                max = Integer.max(max,arr[i]);
            }
            List<Integer> b = new ArrayList<Integer>();
            List<Integer> c = new ArrayList<Integer>();
            for(int i = 0;i<n;i++)
            {
                if(arr[i] == max)
                {
                    c.add(arr[i]);
                }
                else
                {
                    b.add(arr[i]);
                }
            }
            if(b.isEmpty() || c.isEmpty()){
                System.out.println(-1);
                continue;
            }
            System.out.println(b.size() + " " + c.size());
            for(int e : b)
                System.out.print(e + " ");
            System.out.println();
            for(int e : c)
                System.out.print(e + " ");
        }
    }
}