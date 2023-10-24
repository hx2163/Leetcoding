class Solution {
    public int lengthOfLIS(int[] nums) {

        //initializing the new Array to store the LIS at each index
        int[] dp = new int[nums.length];
        int max = 1;
        
        // opt[j] = max{all of the opt[k] checking from 0 to < k if kth < jth: 1+dp[k]}
        for(int j=0; j<nums.length; j++){
            dp[j] = 1;
            //checking from 0 to < k
            for(int k=0; k<j; k++){
                if(nums[k] < nums[j]){
                    dp[j] = Math.max(dp[j], dp[k]+1);
                    max = Math.max(max, dp[j]);               
                }
            }
        }
        return max;
    }

}


