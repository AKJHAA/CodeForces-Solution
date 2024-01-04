import java.util.Arrays;
import java.util.Scanner;
public class CF_1535A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int arr[] = new int[4];
            for(int i = 0;i < 4;i++)
            {
                arr[i] = sc.nextInt();
            }
            int win1 = Integer.max(arr[0] , arr[1]);
            int win2 = Integer.max(arr[2] , arr[3]);
            Arrays.sort(arr);
            int res = win1 + win2;
            if(res == arr[2] + arr[3])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

/*
3

.....#..
#...#...
.#.#....
..#.....
.#.#....
#...#...
.....#..
......#.

#.#.....
.#......
#.#.....
...#....
....#...
.....#..
......#.
.......#

.#.....#
..#...#.
...#.#..
....#...
...#.#..
..#...#.
.#.....#
#.......

*/    
