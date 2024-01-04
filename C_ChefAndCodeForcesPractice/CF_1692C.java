import java.util.Scanner;
public class CF_1692C
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while(t-- > 0)
        {
            char arr[][] = new char[9][9];
            for(int i = 1;i < 9;i++)
            {
                String str = sc.next();
                for(int j = 1;j < 9 ; j++)
                {
                    arr[i][j] = str.charAt(j-1);
                }
            }
            for(int i = 2;i < 8;i++)
            {
                for(int j = 2;j < 8;j++)
                {
                    if(arr[i][j] == '#' && arr[i-1][j-1] == '#' && arr[i-1][j+1] == '#' && arr[i+1][j-1] == '#' && arr[i+1][j+1] == '#')
                        System.out.println(i + " " + j);
                }
            }
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
