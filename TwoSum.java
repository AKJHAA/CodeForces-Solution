import java.util.HashMap;
import java.util.*;
public class TwoSum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++)
            arr[i] = sc.nextInt();
        Map<Integer , Integer> hp = new HashMap<>();
        for(int i = 0 ; i < n; i++)
        {
            int req = sum - arr[i];
            if(hp.containsKey(req) == true)
            {
                System.out.println(hp.get(req) + 1 + " " + (i + 1));
                return;
            }
            else    
                hp.put(arr[i] , i);
        }
        System.out.println("IMPOSSIBLE");
    }
    
}
