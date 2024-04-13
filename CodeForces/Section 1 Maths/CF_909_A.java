import java.util.Scanner;

public class CF_909_A {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            solve(n);
        }
    }
    public static void solve(int n){
        if(n % 3 == 0)
            System.out.println("Second");
        else
            System.out.println("First");
    }
}
/*
A. Game with Integers
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Vanya and Vova are playing a game. Players are given an integer n
. On their turn, the player can add 1
 to the current integer or subtract 1
. The players take turns; Vanya starts. If after Vanya's move the integer is divisible by 3
, then he wins. If 10
 moves have passed and Vanya has not won, then Vova wins.

Write a program that, based on the integer n
, determines who will win if both players play optimally.

Input
The first line contains the integer t
 (1≤t≤100
) — the number of test cases.

The single line of each test case contains the integer n
 (1≤n≤1000
).

Output
For each test case, print "First" without quotes if Vanya wins, and "Second" without quotes if Vova wins.

Example
inputCopy
6
1
3
5
100
999
1000
outputCopy
First
Second
First
First
Second
First
*/