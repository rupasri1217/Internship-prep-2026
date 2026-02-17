import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] result = new int[nums.length];

        result[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
class RunningSum{
    public static void main(String args[]) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] result = s.runningSum(nums);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        } 
    }
}