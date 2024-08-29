// B. Removals Game
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CF_EPIC_AUGUST_B 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) 
        {
            int n = Integer.parseInt(br.readLine());
            String[] arr2 = br.readLine().split(" ");
            String[] arr1 = br.readLine().split(" ");

            boolean isRev = true;
            boolean isSame = true;
            
            for (int i = 0; i < n; i++) 
            {
                if (!arr1[i].equals(arr2[n - i - 1])) 
                    isRev = false;

                if (!arr1[i].equals(arr2[i])) 
                    isSame = false;
                
                if (!isSame && !isRev) 
                    break;
                
            }
            
            System.out.println((isSame || isRev) ? "Bob" : "Alice");
        }
    }
}