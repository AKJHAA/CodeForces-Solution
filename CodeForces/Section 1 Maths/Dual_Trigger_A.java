import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
            solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int cnt=0;
        for(int i=0;i<n;i++) {
            if (s.charAt(i) == '1')
                cnt++;
        }
        
        if(cnt == 2){
            int id1=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    id1=i;
                    break;
                }
            }
            
            if(s.charAt(id1+1)=='1'){
                System.out.println("NO");
                return;
            }
        }
        if(cnt%2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}

