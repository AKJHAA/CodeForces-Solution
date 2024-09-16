import java.util.*;
             
public class CF_2001_A {
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
        int[] count = new int[101];
        int max = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            count[num]++;
            max = Math.max(max , count[num]);
        }
        
        System.out.println(n - max);
    } 
}