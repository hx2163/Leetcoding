class Solution {
    public int totalFruit(int[] tree) {
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currMax = 0;
        int max = 0;
        
        for(int fruit : tree){
            
            //curr fruit is the same or not
            if(fruit == lastFruit || fruit == secondLastFruit) 
                currMax +=1;
            else
                currMax = lastFruitCount + 1;  
            
            //check if the lastFruitCount is the same or not
            if(fruit == lastFruit)
                lastFruitCount +=1;
            else 
                lastFruitCount = 1;
            
            if(fruit != lastFruit){
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            max = Math.max(max, currMax);
        }
        return max;
        }
}

