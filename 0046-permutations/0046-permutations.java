class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0) return res;
        helper(nums, res, new ArrayList<>());
        return res;        
    }

    public void helper(int[] nums, List<List<Integer>> res, List<Integer> temp){
        //base case
        if(temp.size() == nums.length){
           res.add(new ArrayList<>(temp));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(temp.contains(nums[i])) continue; // element already exists, skip
                temp.add(nums[i]);
                helper(nums, res, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}