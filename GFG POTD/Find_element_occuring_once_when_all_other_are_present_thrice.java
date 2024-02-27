// Find_element_occuring_once_when_all_other_are_present_thrice

class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
      int ans = 0;
      for(int i = 0;i < 32 ;i++)
      {
          int count = 0;
          for(int j = 0 ;j < N;j++)
          {
              //checking whether the ith bits of element is set or not, if it is then add in the counts
              if((arr[j] & (1 << i)) != 0)
                count++;
          }
          if(count % 3 != 0)
            ans = ans + (1 << i);
      }
      return ans;
    }
}  
