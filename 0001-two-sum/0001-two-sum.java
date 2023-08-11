class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        遍历nums把 target - nums[i]的值存在hashMap里面 as anotherIndex
        如果anotherIndex != null 找到结果并返回
        */
        Map<Integer, Integer> storeNums = new HashMap<>(nums.length, 1);
        int[] result = new int[2];
        for (int i = 0; i< nums.length; i++){
            int another = target - nums[i];
            Integer anotherIndex = storeNums.get(another);
            if (anotherIndex != null){
                result[0] = anotherIndex;
                result[1] = i;
                break;
            }else{
                storeNums.put(nums[i],i);
            }
        }
        return result;
    }
}