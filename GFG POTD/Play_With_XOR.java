/*You are given an array arr[] of length n, you have to re-construct the same array arr[] in-place. The arr[i] after reconstruction will become arr[i] OR arr[i+1], where OR is bitwise or. If for some i, i+1 does not exists, then do not change arr[i].

Example 1:

Input :
n = 5
arr[] = {10, 11, 1, 2, 3}
Output :
11 11 3 3 3
Explanation:
At index 0, arr[0] or arr[1] = 11
At index 1, arr[1] or arr[2] = 11
At index 2, arr[2] or arr[3] = 3
...
At index 4, No element is left So, it will remain as it is.
New Array will be {11, 11, 3, 3, 3}.*/

public class Play_With_XOR {
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        if(n == 1)
            return arr;
        int nums[] = new int[n];
        nums[n-1] = arr[n - 1];
        for(int i = 0;i < n - 1;i++){
            nums[i] = (arr[i] | arr[i+1]);
        }
        return nums;
    }
}