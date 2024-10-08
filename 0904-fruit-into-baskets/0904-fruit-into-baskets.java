class Solution {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        int res = 0, left = 0;
        
        for (int right = 0; right < tree.length; ++right){
            count.put(tree[right], count.getOrDefault(tree[right],0)+1); //update hashmap
  
            //if more than 2 element, remove the leftmost element from hashMap
            while (count.size() > 2) {
                count.put(tree[left], count.get(tree[left]) - 1);
                if (count.get(tree[left]) == 0) count.remove(tree[left]);
                left++;
            }
            
            //compare max res
            res = Math.max(res, right - left +1);
            
        }
        return res;
    }
}





