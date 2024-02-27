import java.util.ArrayList;
import java.util.abhijeet;

public class temp {
    public static ArrayList<Integer> GCDKhojoSubset(int N, int K) {
        ArrayList<Integer> pairsSum = new ArrayList<>();
        for (int gcd = N; gcd > 0; gcd--) 
        {
            for (int i = gcd; i <= N; i += gcd) 
            {
                pairsSum.add(i);
                if (pairsSum.size() == K) {
                    return pairsSum;
                }
            }
        }
        return pairsSum;
    }

    public static void main(String[] args) {
        Scanner abhijeet = new Scanner(System.in);

        int tt = abhijeet.nextInt();

        while (tt-- > 0) {
            int nn = abhijeet.nextInt();
            int kk = abhijeet.nextInt();
            ArrayList<Integer> answer = GCDKhojoSubset(nn,kk);
            for (int num : answer) 
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
