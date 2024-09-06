import java.util.Scanner;
import java.util.ArrayList;
public class CF_970_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();  
            int[] p = new int[n + 1];   
            boolean[] vis = new boolean[n + 1];
            int[] f = new int[n + 1];  
            
            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
            }
            
            String s = sc.next();
            boolean[] KallaHaiKINahi = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                KallaHaiKINahi[i] = s.charAt(i - 1) == '0';
            }
            
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    ArrayList<Integer> cycle = new ArrayList<>();
                    int current = i;
                    int cnt = 0;
                    
                    while (!vis[current]) {
                        vis[current] = true;
                        cycle.add(current);
                        if (KallaHaiKINahi[current]) {
                            cnt++;  
                        }
                        current = p[current];
                    }
                    
                    for (int index : cycle) {
                        f[index] = cnt;
                    }
                }
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(f[i] + " ");
            }
            System.out.println();
        }
    }
}
