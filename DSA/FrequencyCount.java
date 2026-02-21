import java.util.*;
class Solution
{
    public int frequencyCount(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxCount = 0;
        int result = 0;
        for(int key : map.keySet())
        {
            if(map.get(key)>maxCount)
            {
                maxCount = map.get(key);
                result = key;
            }

        }
        return result;
    }
}
class FrequencyCount
{
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int[] nums = {1,2,3,2,4,1,2};
        System.out.println(sol.frequencyCount(nums));
    }
}