
// B. Turtle and Piggy Are Playing a Game 2
import java.util.*;
public class CF_968__B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[n / 2]);

        }
    }
}