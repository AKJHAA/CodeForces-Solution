import java.util.Scanner;

public class CF_350_D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the recipe string
        int n = sc.nextInt();
        int magic = sc.nextInt();

        // Reading the prices of ingredients
        int a[] = new int[n]; int sum = 0;
        for(int i= 0;i < n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        // Reading the available ingredients
        int p[] = new int[n];
        for(int i = 0;i < n;i++){
            p[i] = sc.nextInt();
        }
        // Binary search to find the maximum number of hamburgers
        long low = 0;
        long high = (long) 1e13; // Start with a high number to find the maximum
        while(low <= high){
            long mid = (low + high) / 2;
            long totNeed = 0;
            for(int i = 0;i < n;i++){
                long temp = p[i] - (a[i] * mid);
                if(temp < 0) totNeed -= temp;
            }
            
            if(magic - Math.abs(totNeed) < 0)
                high = mid - 1;
            else    
                low = mid + 1;
        }
        // Output the maximum number of hamburgers
        System.out.println(high);
    }
}
