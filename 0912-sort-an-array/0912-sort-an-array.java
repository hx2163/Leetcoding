class Solution {
    public int[] sortArray(int[] nums) {
        //return quickSort(nums, 0, nums.length - 1);
        shellSort(nums, nums.length);
        return nums;
    }
    
//     public static int[] quickSort(int[] array, int start, int end){
//         if(array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        
//         /*分区指示器*/
//         int zoneIndex = partition(array, start, end);
//         if(zoneIndex > start){
//             quickSort(array, start, zoneIndex - 1);
//         }
//         if(zoneIndex < end){
//             quickSort(array, zoneIndex + 1, end);
//         }
//         return array;
//     }
    
//     /*分区方法*/
//     public static int partition(int[] array, int start, int end){
//         // one element left
//         if(start == end) return start;
//         // choose the rightmost element as pivot
//         int pivot = array[end];
//         int zoneIndex = start - 1;

//         for(int i = start; i <= end; i++){
//             if(array[i] <= array[end]){
//                 zoneIndex ++;
//                 if(i > zoneIndex)
//                     swap(array, i , zoneIndex);
//             }
//         }
//         return zoneIndex;
//     }
    
//     public static void swap(int[] array, int i, int j){
//         int temp = array[i];
//         array[i] = array[j];
//         array[j] = temp;
//     }
    
      void shellSort(int array[], int n) {
          for (int interval = n / 2; interval > 0; interval /= 2) {
                for (int i = interval; i < n; i += 1) {
                    int temp = array[i];
                    int j;
                    for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                      array[j] = array[j - interval];
                    }
                array[j] = temp;
                }
          }
     }
}