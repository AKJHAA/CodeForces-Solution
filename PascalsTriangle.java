import java.util.List;
import java.util.Scanner;
public class PascalsTriangle
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        List<List<Integer>> aList = pasTri(num);
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
    public static ArrayList<ArrayList<Integer>> pasTri(arr)
    {
        List<List<Integer>> main = new ArrayList<List<nteger>>();
        List<Integer> prev = new Arrayist<Integer>();
        prev.add(1);
        main.add(prev);
        for(int i = 2;i <= num;i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0;j < prev.size() - 1;j++)
            {
                temp.add(prev.get(i) + prev.get(i+1));

            }
            temp.add(1);
            main.add(temp);
            prev = temp;
        }
        return main;
    }
}