//Brute Force
// public class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;
        
//         // 外层循环枚举子数组的起始位置
//         for (int start = 0; start < nums.length; start++) {
//             int sum = 0;
//             // 内层循环枚举子数组的结束位置
//             for (int end = start; end < nums.length; end++) {
//                 sum += nums[end];
                
//                 // 检查当前子数组的和是否等于 k
//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }
        
//         return count;
//     }
// }

//Hash Map
public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSums = new HashMap<>(); //key: preSum, value: frequency
        int sum = 0;
        int count = 0;
         prefixSums.put(0,1); // ==> basecase empty subarray
            
        for(int num : nums){
            sum += num;  
            int diff = sum - k;
            //if there is a prefixSum found in the map 
            if(prefixSums.containsKey(diff)){
                count +=  prefixSums.get(diff);
            }
            //else add the sum into prefixSum map
            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
