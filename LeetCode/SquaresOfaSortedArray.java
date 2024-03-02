/*977. Squares of a Sorted Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.*/
// -----------------------------------------------------------------------------------------
class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {   // Square each element in 'nums'.
            nums[i] *= nums[i];
        }
        int i = n - 1;  //initial position of i 
        int l = 0, r = n - 1;
        // Use two pointers to merge sorted squares in non-decreasing order.
        while (l <= r) {
            if (nums[l] > nums[r]) {
                ans[i--] = nums[l++];
            } else {
                ans[i--] = nums[r--];
            }
        }
        return ans;
    }
}
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int num : nums){
        //     pq.add(num * num);
        // }
        // int res[] = new int[nums.length];
        // int i = 0;
        
        // while(!pq.isEmpty()){
        //     res[i++] = pq.poll();
        // }
        // return res;
//     }
// }
