import java.util.*;
class Solution
{
    HashSet<Integer> set =new HashSet<>();
    public boolean containsDuplicate(int[] nums)
    {
        for(int num : nums)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
class ContainsDuplicate
{
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int[] nums = {1,2,3,4,5,1};
        System.out.println(sol.containsDuplicate(nums));
    }
}