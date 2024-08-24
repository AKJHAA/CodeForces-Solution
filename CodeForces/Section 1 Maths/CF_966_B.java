// B. Seating in a Bus

import java.util.*;
public class CF_966_B {
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
            solve(n , arr);
        }

    }
    /*4
5
5 4 2 1 3 arr
_ _ _ _ _ _
0 1 2 3 4 5 vis
 */
    public static void solve(int n , int arr[]){
            int vis[] = new int[n + 1];
            for(int i = 0;i < n;i++){
                if(i == 0){
                    vis[arr[i]]++;
                    continue;
                }
                if(arr[i] == n && vis[n - 1] == 0){
                    System.out.println("NO");
                    return;
                }
                else if(arr[i] == 1 && vis[i + 1] == 0){
                    System.out.println("NO");
                    return;
                }
                else if(vis[arr[i] - 1] == 0 && vis[arr[i] + 1] == 0){
                    System.out.println("NO");
                    return;
                }
                else{
                    vis[arr[i]]++;
                }
                    
            }
            System.out.println("yES");
    }
    
}
