// C. Numeric String Template
import java.util.*;
public class CF_966_C {
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
            int nn = sc.nextInt();
            while(nn-- > 0){
                String str = sc.next();
                solve(arr , str);
            }
        }
    }/*5
3 5 2 1 3
2
abfda
afbfa */
    public static void solve(int arr[] , String str){
        if(arr.length != str.length()){
            System.out.println("no");
            return;
        }
        Map<Integer , Character> map = new HashMap<>();
        Map<Character , Integer> map1 = new HashMap<>();

        for(int i = 0;i < arr.length;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i]) != str.charAt(i)){
                    System.out.println("no");
                    return;
                }
            }
            else{
                map.put(arr[i] , str.charAt(i));
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(map1.containsKey(str.charAt(i))){
                if(map1.get(str.charAt(i)) != arr[i]){
                    System.out.println("no");
                    return;
                }
            }
            else{
                map1.put(str.charAt(i) , arr[i]);
            }
        }
        System.out.println("yES");
    }
    
}
