import java.util.*;

public class CF_notAString 
{

    public static void main(String abhijet[]) 
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            if (s.equals("()"))
                System.out.println("NO");

            else {
                StringBuilder s1 = new StringBuilder();
                StringBuilder s2 = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    s1.append('(');
                }
                for (int i = 0; i < s.length(); i++) {
                    s1.append(')');
                }

                for (int i = 0; i < s.length(); i++) {
                    s2.append("()");
                }

                if (s2.indexOf(s) == -1) {
                    System.out.println("YES");
                    System.out.println(s2);
                } else {
                    System.out.println("YES");
                    System.out.println(s1);
                }
            }
        }
    }
    public static void CF_1858A(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int abhi = a + (c + 1) / 2;
            int jeet = b + c / 2;
            if(abhi > jeet)
                System.out.println("First");
            else
                System.out.println("Second");
                
        }
    }
    public static void CF_1399A(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            String str = "Yes";
            for(int i = 1;i<n;i++)
            {
                if(arr[i] - arr[i - 1] > 1)
                {
                    str = "No";
                    break;
                }
            }
            System.out.println(str);
        }
    }
}