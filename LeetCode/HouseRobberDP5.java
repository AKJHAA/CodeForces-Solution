/*
 * 198. House Robber
Solved
Medium
Topics
Companies
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
 */
import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        int n = nums.size();
        int prev = nums.get(0);
        int prev2 = 0;
        for(int i = 1 ;i < n;i++){
            int pick = nums.get(i);
            if(i > 1)
                pick = pick + prev2;
            int nonPick = prev;
            int curr = Math.max(pick , nonPick);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
// Space Optimal Approach T.C-> O(N) , S.C-> O(1)
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int prev = nums[0];
    //     int prev2 = 0;
    //     for(int i = 1 ;i < n;i++){
    //         int pick = nums[i];
    //         if(i > 1)
    //             pick = pick + prev2;
    //         int nonPick = prev;
    //         int curr = Math.max(pick , nonPick);

    //         prev2 = prev;
    //         prev = curr;
    //     }
    //     return prev;
    // }
    /*
    // --------------------TABULTAION APPROACH-----------------------
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for(int i = 1 ;i < n;i++){
            int pick = nums[i];
            if(i > 1)
                pick = pick + dp[i - 2];
            int nonPick = 0 + dp[i - 1];
            dp[i] = Math.max(pick , nonPick);
        }
        return dp[n - 1];
    }*/
    /*
    // MEMOIZATION
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
        dp[0] = nums[0];
        return memo(nums, n  - 1, dp);
    }
    public int memo(int nums[] , int ind , int dp[]){
        if(ind == 0)
            return dp[ind];
        if(ind < 0)
            return 0;
        if(dp[ind] != -1)
            return dp[ind];
        int pick = nums[ind] + memo(nums , ind - 2 , dp);
        int nonPic = 0 + memo(nums , ind - 1 , dp);

        return dp[ind] = Math.max(pick , nonPic);
    }*/
    /*
    // -----------TLE----------------
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        return memo(nums, n  - 1, dp);
    }
    public int memo(int nums[] , int ind , int dp[]){
        if(ind == 0)
            return nums[ind];
        if(ind < 0)
            return 0;
        int pick = nums[ind] + memo(nums , ind - 2 , dp);
        int nonPic = 0 + memo(nums , ind - 1 , dp);

        return Math.max(pick , nonPic);
    }*/