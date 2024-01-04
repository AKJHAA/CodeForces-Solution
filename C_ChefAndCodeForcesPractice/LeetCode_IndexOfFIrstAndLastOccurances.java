public class LeetCode_IndexOfFIrstAndLastOccurances
{
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1, -1};
            // First Occurrence
            int start = 0, end = nums.length - 1;
            int mid = (start + end) / 2;
            while (start <= end) {
                mid = (start + end) / 2;
                if (target == nums[mid]) {
                    ans[0] = mid;
                    end = mid - 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                }
            }
            // Last Occurrence
            start = 0;
            end = nums.length - 1;
            while (start <= end) {
                mid = (start + end) / 2;
                if (target == nums[mid]) {
                    ans[1] = mid;
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                }
            }
            return ans;
        }
}
/*public int[] searchRange(int[] nums, int target)
    {
        int i,first = -1,second = -1;
        int arr[] = {-1,-1};
            for(i=0;i<nums.length;i++)
            {
                if(nums[i] == target)
                {
                    arr[0] = i;
                    break;
                }
            }
            for(i =nums.length-1;i>=0;i--)
            {
                if(nums[i] == target)
                {

                    arr[1] = i;
                    break;
                }
            }
        return arr;
    }*/
