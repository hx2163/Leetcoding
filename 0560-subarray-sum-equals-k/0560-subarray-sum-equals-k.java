
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        // 外层循环枚举子数组的起始位置
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            // 内层循环枚举子数组的结束位置
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                
                // 检查当前子数组的和是否等于 k
                if (sum == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
