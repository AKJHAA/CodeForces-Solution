import java.util.Scanner;

public class Codeforce_Division 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int rating = sc.nextInt();
            if(rating <= 1399)
                System.out.println("Division 4");
            else if(rating >= 1400 && rating <= 1599)
                System.out.println("Division 3");
            else if(rating >= 1600 && rating <= 1899)
                System.out.println("Division 2");
            else 
                System.out.println("Division 1");
        }
    }
}
/*
 For Division 1: 1900≤rating
For Division 2: 1600≤rating≤1899
For Division 3: 1400≤rating≤1599
For Division 4: rating≤1399
 */
