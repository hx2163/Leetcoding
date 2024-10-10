class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        
        for(int i=0; i<nums.length; i++){
            int another = target - nums[i];
            Integer anotherIndex = map.get(another);
            if(anotherIndex != null){
                res[0] = anotherIndex;
                res[1] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}