class Solution {
    
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;        
    }

// Recursive
    public int searchRec(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        return searchNUMS(nums, start, end,target);       
    }
    
    
    public int searchNUMS(int[] nums, int start, int end, int target) {
        
        if(start <= end){
            int mid = (start + end) / 2;
            if(target < nums[mid]){
                return searchNUMS(nums, start, mid-1, target);
            }else if(target > nums[mid]){
                return searchNUMS(nums, mid+1, end, target);
            }else{
                return mid;
            }
        }else{
            return -1;
        }
        
    }
    
}