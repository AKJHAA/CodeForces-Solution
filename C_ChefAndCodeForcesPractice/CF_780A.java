import java.util.*;
import java.util.Scanner;

public class CF_780A
{
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		int el,ans=0;
		HashSet<Integer> s = new HashSet<>();
		for(int i = 0; i < 2*n; i++)
		{
		    el = sc.nextInt();
		    if(s.contains(el))
                s.remove(el);
		    else
                s.add(el);
		    ans=Math.max(ans,s.size());
		}
		System.out.println(ans);
	}
}
