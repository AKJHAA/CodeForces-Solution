/**Check if a number is divisible by 8
EasyAccuracy: 22.22%Submissions: 27K+Points: 2
Given a string representation of a decimal number s, check whether it is divisible by 8.

Example 1:

Input:
s = "16"
Output:
1
Explanation:
The given number is divisible by 8,
so the driver code prints 1 as the output.
Example 2:

Input:
s = "54141111648421214584416464555"
Output:
-1
Explanation:
Given Number is not divisible by 8, 
so the driver code prints -1 as the output. */

class Check_Number_is_Divisible_by_8{
    int DivisibleByEight(String s){
        int n = s.length();
        if(n < 3){
            if(Integer.parseInt(s) % 8 == 0)
                return 1;
            else 
                return -1;
        }
        else
        {
            StringBuilder sb = new StringBuilder("");
            sb.append(s.charAt(n - 3));
            sb.append(s.charAt(n - 2));
            sb.append(s.charAt(n - 1));
            if(Integer.parseInt(sb.toString()) % 8 == 0)
                return 1;
            else 
                return -1;
        }
    }
}