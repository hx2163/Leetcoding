class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, 0, new ArrayList<Integer>());
        return res;
    }

    private void helper(int[] nums, List<List<Integer>> res, int index, List<Integer> tempList){
        // add temp to res 
        res.add(new ArrayList<>(tempList));
        for(int i = index; i < nums.length; i++){
            tempList.add(nums[i]);
            helper(nums, res, i+1, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}