class Solution {
    public boolean containsDuplicate(int[] nums) {
        //use hash set to check duplicate
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return set.size() < nums.length;
    }
}