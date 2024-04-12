import java.util.*;
public class Battle_Cows_B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n ;i++){
                arr[i] = sc.nextInt();
            }
        
            int cow = arr[k - 1];
            int j = 0;
            for(int i = 0;i < n;i++){
                if(arr[i] >= cow){
                    arr[k - 1] = arr[i];
                    arr[i] = cow;
                    j = i;
                    break;
                    
                }
            }
            // 386397236 187533184 8314578 802929321 432147499
            int cnt = 0;
            if(j != 0)
                cnt = 1;;
            int prev = arr[j];

            for(int i = j + 1;i < n;i++){
                if(prev > arr[i]){
                    cnt++;
                }
                else    
                    break;
            }
            System.out.println(cnt);
    }
    }
}
/*There are n
 cows participating in a coding tournament. Cow i
 has a Cowdeforces rating of ai
 (all distinct), and is initially in position i
. The tournament consists of n−1
 matches as follows:

The first match is between the cow in position 1
 and the cow in position 2
.
Subsequently, each match i
 is between the cow in position i+1
 and the winner of match i−1
.
In each match, the cow with the higher Cowdeforces rating wins and proceeds to the next match.
You are the owner of cow k
. For you, winning the tournament is not important; rather, you want your cow to win in as many matches as possible. As an acquaintance of the tournament organizers, you can ask them to swap the position of your cow with another cow only once, or you can choose to do nothing.

Find the maximum number of wins your cow can achieve.

Input
Each test contains multiple test cases. The first line contains an integer t
 (1≤t≤104
) — the number of test cases. The description of the test cases follows.

The first line of each test case contains two integers n
 and k
 (2≤n≤105,1≤k≤n
) — the number of cows and your cow's index.

The second line of each test case contains n
 integers a1,a2,…,an
 (1≤ai≤109
) — the Cowdeforces rating of the cows. It is guaranteed that ai
's are pairwise different.

It is guaranteed that the sum of n
 over all test cases does not exceed 105
.

Output
For each test case, print one integer: the maximum number of wins cow k
 can achieve if you choose to swap (or do nothing) optimally.

Example
inputCopy
3
6 1
12 10 14 11 8 3
6 5
7 2 727 10 12 13
2 2
1000000000 1
outputCopy
1
2
0
Note
In the first test case, it is optimal to do nothing. Let a′
 be the Cowdeforces rating of the cows in the original order (with your cow's rating bolded), then

Initially, a′=[12,10,14,11,8,3]
.
Your cow plays against the cow with Cowdeforces rating 10
 and wins. a′=[12,14,11,8,3]
.
Your cow plays against the cow with Cowdeforces rating 14
 and loses.
In total, your cow wins 1
 match.
In the second test case, it is optimal to swap your cow to position 3
. Then, let a′
 be the Cowdeforces rating of the cows in the order after the swap.

Initially, a′=[7,2,12,10,727,13]
.
The cow with Cowdeforces rating 7
 plays against the cow with Cowdeforces rating 2
 and wins. a′=[7,12,10,727,13]
.
The cow with Cowdeforces rating 7
 plays against your cow, and your cow wins. a′=[12,10,727,13]
.
Your cow plays against the cow with Cowdeforces rating 10
 and wins. a′=[12,727,13]
.
Your cow plays against the cow with Cowdeforces rating 727
 and loses.
In total, your cow wins 2
 matches.
 */