import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CF_Contest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            HashMap<Integer,Integer> hp = new HashMap<>();
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                if(hp.containsKey(arr[i]))
                {
                    hp.put(arr[i],0);
                }
                else
                {
                    hp.put(arr[i],i);
                }
            }
            //[13,13,13,4,13,13,13]
            for(Map.Entry<Integer,Integer> e : hp.entrySet())
            {
                if(e.getValue() == 1)
                    System.out.println(e.getValue());
            }
        }
    }
}





// import java.util.Scanner;
// public class CF_Contest
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-- > 0)
//         {
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         int sum = 0;
//         for(int i = 0;i<size;i++)
//         {
//             arr[i] = sc.nextInt();
//             sum = sum + arr[i];
//         }
//         if(sum % 2 == 0)
//             System.out.println("YES");
//         else
//             System.out.println("NO");
//         }
//     }
// }
// /*
// 7
// 8
// 1 2 4 3 2 3 5 4
// 2
// 4 7
// 3
// 3 9 8
// 2
// 1 7
// 5
// 5 4 3 2 1
// 4
// 4 3 4 5
// 2
// 50 48
                
//  */