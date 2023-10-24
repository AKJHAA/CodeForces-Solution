import java.util.*;
public class Permutation
{
    public static void permutation(int[] arr , List<Integer> ds , List<List<Integer>> ans , int[] flag)
    {
            if(ds.size() == arr.length){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i = 0;i < arr.length;i++)
            {
                if(flag[i] == 0)
                {
                    ds.add(arr[i]);
                    flag[i] = 1;
                    permutation(arr, ds, ans, flag);
                    ds.remove(ds.size() - 1);
                    flag[i] = 0;
                }
            }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1 , 2 , 3};
        int flag[] = new int[5];
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        permutation(arr , ds , ans , flag);
        System.out.println(ans);
    }
}