import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
		    int s=sc.nextInt();
		    String str=sc.next().toLowerCase();
		    String res=str.charAt(0)+"";
		    for(int k=1;k<s;k++)
		    {
		       if(str.charAt(k)!=str.charAt(k-1))
		       res+=str.charAt(k);
		    }
		   if(res.equals("meow")) 
		   {
		        System.out.println("YES");
		   }
		   else 
		   {
		        System.out.println("NO");
		   }
		}
	}
}

									  	      		   	   	  	
/*7
4
meOw
14
mmmeooowwwwwww
3
mew
7
MmeEeUw
4
MEOW
6
MmyaVW
5
meowA
 */