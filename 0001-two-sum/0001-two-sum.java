class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                res[0] = map.get(complement);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);    
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}