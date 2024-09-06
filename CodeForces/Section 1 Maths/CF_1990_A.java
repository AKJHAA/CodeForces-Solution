import java.util.*;
             
public class CF_1990_A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int testcases = sc.nextInt();
        while(testcases > 0) {
            solve();
            testcases--;
        }
    }
    public static void solve() {
        int n = sc.nextInt();
        int[] count = new int[n+1];
        // if(n==1) {
        //     System.out.println("YES");
        // }
        for(int i = 0; i < n; i++) {
            count[sc.nextInt()]++;
        }
        for(int i = 0; i <= n; i++) {
            if(count[i]%2 == 1) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    } 
}