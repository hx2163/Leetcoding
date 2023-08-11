class Solution {
    public int climbStairsRecursion(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs (n - 1) + climbStairs (n - 2);
    }

 //   Time Limit Exceeded -- >  用hashmap保存f(n)值


    private Map<Integer, Integer> storeMap = new HashMap<>();
    public int climbStairsHashMap(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(storeMap.get(n) != null ) //if f(n) != null
            return storeMap.get(n);
        else{
            int result = climbStairsHashMap(n-1) + climbStairsHashMap(n-2);
            storeMap.put(n, result);
            return result;
        }
    }

    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int result = 0;
        int pre = 2;
        int prePre = 1;
        for(int i = 3; i <= n; ++i){
            result = pre + prePre;
            prePre = pre;
            pre = result;
        }
        return result;
    }
}

