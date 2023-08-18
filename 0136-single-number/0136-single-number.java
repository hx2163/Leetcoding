class Solution {
    /*
    bit manipulation
    AND & : (1&1=1, 0&0=0, 1&0=0) 
    OR  | : (1|1=1, 0|0=0, 1|0=1)
    NOT ~ : (~1=0, ~0=1)
    XOR ^ : (1^1=0, 1^0=1, 0^0=0)
    Left Shift >> : 正数高位补0,负数高位补1
    Right Shift <<
    >>>: 不论正负,高位补0
    */
    
    //bit manipulation
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result = result ^ num;
        }
        return result;
        
    }

    //HashMap
    public int singleNumberHashMap(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++ ){
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i],1);
            }else{
                freq.put(nums[i],freq.get(nums[i]) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1){
                return key;
            }
        }
        return -1;
    }
}