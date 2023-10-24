import java.util.Scanner;
public class Translation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.length() != t.length())
        {
            System.out.println("NO");
            return;

        }
        int low,high = s.length()-1;
        for(low = 0;low<s.length();low++,high--)
        {
            if(s.charAt(low) != t.charAt(high))
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
/*
						            	    DOMINGO_GIRL :)
											─────────▄──────────────▄
											────────▌▒█───────────▄▀▒▌
											────────▌▒▒▀▄───────▄▀▒▒▒▐
											───────▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐
											─────▄▄▀▒▒▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐
											───▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀██▀▒▌
											──▐▒▒▒▄▄▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄▒▒▌
											──▌▒▒▐▄█▀▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
											─▐▒▒▒▒▒▒▒▒▒▒▒▌██▀▒▒▒▒▒▒▒▒▀▄▌
											─▌▒▀▄██▄▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▌
											─▌▀▐▄█▄█▌▄▒▀▒▒▒▒▒▒░░░░░░▒▒▒▐ Wow
											▐▒▀▐▀▐▀▒▒▄▄▒▄▒▒▒▒▒░░░░░░▒▒▒▒▌
										   	▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒░░░░░░▒▒▒▐
											─▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒▒▒░░░░▒▒▒▒▌
											─▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐
											──▀▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▒▒▒▒▌
											────▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀
											───▐▀▒▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀
											──▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▀
                                    	*/