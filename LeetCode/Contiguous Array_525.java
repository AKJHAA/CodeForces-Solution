/*
Code
525. Contiguous Array
Solved
Medium
Topics
Companies
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1. */
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int ans = 0;
        map.put(0, -1);

        for(int i=0; i<nums.length; i++) {
            if(nums[i]==1) {
                count++;
            }
            else{
                count--;
            }

            if(map.containsKey(count)) {
                ans = Math.max(ans, i-map.get(count));
            }
            else {
                map.put(count, i);
            }
        }
        return ans;
    }
}
