public class Minimum_Number_of_Operations_to_Make_Array_Empty_2870 {
    public int minOperations(int[] nums) {
        Map<Integer , Integer> hp = new HashMap<>();
        for(int num : nums)
            hp.put(num , hp.getOrDefault(num,0) + 1);
        int count = 0;
        for(Map.Entry<Integer , Integer> e : hp.entrySet())
        {
            int temp = e.getValue();
            if(temp == 1)
                return -1;
            count += Math.ceil((double)temp / 3);
        }
        return count;
    }
}
