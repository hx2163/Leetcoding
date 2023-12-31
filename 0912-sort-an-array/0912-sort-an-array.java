class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length < 1) return null;
        if(nums.length < 15){
            shellSort(nums, nums.length);
            return nums;
        }
          //  quickSort(nums,0,nums.length -1);
          //  HeapSort(nums);
          //  return nums;
        else{
            if(nums.length < 2) return nums;
            int mid = nums.length / 2;
            int[] left = Arrays.copyOfRange(nums, 0, mid);
            int[] right = Arrays.copyOfRange(nums, mid, nums.length);
            return mergeSort(sortArray(left), sortArray(right));            
        } 

    }
    

    
    
/****************Shell Sort*********************/
    void shellSort(int[] array, int n) {
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

    
    
/****************Quick Sort*********************/
    void quickSort(int arr[], int start, int end){
        if(start < end){
            int pi = partition(arr, start,end);
            quickSort(arr, start, pi-1);
            quickSort(arr, pi+1, end);
        }
        
    }

    static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++){
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr,i,end);
        return i;
    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    
    
/****************mergeSort*********************/
    public static int[] mergeSort(int[] left, int[] right){
        int[] res = new int[left.length + right.length];
        for (int index=0, i=0, j=0; index < res.length; index++){
            if(i >= left.length){
                res[index] = right[j];
                j++;
            }else if(j >= right.length){
                res[index] = left[i];
                i++;
            }else if (left[i] > right[j]){
                res[index] = right[j];
                j++;
            }else{
                res[index] = left[i];
                i++;
            }
        }
        return res;
    }
    
    
    
    
/****************Heap Sort*********************/
    void HeapSort(int[] arr){
        int N = arr.length;
     
        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
        
        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        } 
    }
    
    
    static void heapify(int[] arr, int N, int i){      
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);        
        }               
    }
}