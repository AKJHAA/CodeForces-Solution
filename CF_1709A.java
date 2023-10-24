import java.util.Scanner;
public class CF_1709A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String str = sc.next();//yES", "yes" and "Yes
            str = str.toUpperCase();
            if(str.equals("YES"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}/*
INPUT
YES
yES
yes
Yes
YeS
Noo
orZ
yEz
Yas
XES
*/
/*
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t>0){
		    
		    int n=sc.nextInt();
		    
		    int ans=0;
		    
		    int min=1000;
		    
		    while(n>0){
		        
		        int val=sc.nextInt();
		        ans+=val;
		        if(val<min){
		            min=val;
		        }
		        n--;
		    }
		    ans-=min;
		    System.out.println(ans);
		    t--;
		}
	}
}
 */