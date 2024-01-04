public class codechef270923 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
        {
		    int n=sc.nextInt();
		    int res=0;
		    int min=1000;
		    while(n>0)
            {
		        int temp = sc.nextInt();
		        res = res + temp;
		        if(temp < min)
                {
		            min = temp;
		        }
		        n--;
		    }
		    res = res - min;
		    System.out.println(res);
		}
	}
}

