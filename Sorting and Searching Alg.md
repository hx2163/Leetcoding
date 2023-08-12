<h2><a href="https://www.programiz.com/dsa/bubble-sort">1. Bubble Sort</a></h2>

Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.

---

<h3>Bubble sort is used when: </h3>

* complexity does not matter
* short and simple code is preferred

---
<h3>Bubble Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n) </code></li>
    <li><code> Worst	O(n^2) </code></li>
    <li><code> Average O(n^2) </code></li>
<b> Space Complexity	</b>
    <li><code> O(1) </code></li>
</ul>

---

<h3>Code:</h3>

```Java
// Optimized Bubble sort in Java

import java.util.Arrays;

class Main {

  // perform the bubble sort
  static void bubbleSort(int array[]) {
    int size = array.length;
    
    // loop to access each array element
    for (int i = 0; i < (size-1); i++) {
    
      // check if swapping occurs
      boolean swapped = false;
      
      // loop to compare adjacent elements
      for (int j = 0; j < (size-i-1); j++) {

        // compare two array elements
        // change > to < to sort in descending order
        if (array[j] > array[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = true;
        }
      }
      // no swapping means the array is already sorted
      // so no need for further comparison
      if (!swapped)
        break;

    }
  }

  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    
    // call method using the class name
    Main.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}

```

---

<h2><a href="https://www.programiz.com/dsa/selection-sort">2. Selection Sort</a></h2>
Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.

---

<h3>The selection sort is used when: </h3>

* a small list is to be sorted
* cost of swapping does not matter
* checking of all the elements is compulsory
* cost of writing to a memory matters

---

<h3>Selection Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n^2) </code></li>
    <li><code> Worst	O(n^2) </code></li>
    <li><code> Average O(n^2) </code></li>
<b> Space Complexity	</b>
    <li><code> O(1) </code></li>
</ul>

---

<h3>Code:</h3>

```Java

// Selection sort in Java

import java.util.Arrays;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
  public static void main(String args[]) {
    int[] data = { 20, 12, 10, 15, 2 };
    SelectionSort ss = new SelectionSort();
    ss.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}

```

---

<h2><a href="https://www.programiz.com/dsa/insertion-sort">3. Insertion Sort</a></h2>
Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.

---

<h3>The insertion sort is used when: </h3>

* the array is has a small number of elements
* there are only a few elements left to be sorted

---

<h3>Insertion Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n) </code></li>
    <li><code> Worst	O(n^2) </code></li>
    <li><code> Average O(n^2) </code></li>
<b> Space Complexity	</b>
    <li><code> O(1) </code></li>
</ul>

---

<h3>Code:</h3>

```Java

// Insertion sort in Java

import java.util.Arrays;

class InsertionSort {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3 };
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}

```
---

<h2><a href="https://www.programiz.com/dsa/merge-sort">4. Merge Sort </a></h2>
Merge Sort is based on the principle of Divide and Conquer Algorithm that is is divided into multiple sub-problems. Each sub-problem is solved individually. Finally, sub-problems are combined to form the final solution.

---

<h3>Merge sort is used when: </h3>

* Inversion count problem
* External sorting
* E-commerce applications

---

<h3>Merge Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n logn) </code></li>
    <li><code> Worst	O(n logn) </code></li>
    <li><code> Average O(n logn) </code></li>
<b> Space Complexity	</b>
    <li><code> O(n) </code></li>
</ul>

---

<h3>Code:</h3>

```Java
// Merge sort in Java

class MergeSort {

  // Merge two subarrays L and M into arr
  void merge(int arr[], int p, int q, int r) {

    // Create L ← A[p..q] and M ← A[q+1..r]
    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    for (int i = 0; i < n1; i++)
      L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = arr[q + 1 + j];

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

  // Divide the array into two subarrays, sort them and merge them
  void mergeSort(int arr[], int l, int r) {
    if (l < r) {

      // m is the point where the array is divided into two subarrays
      int m = (l + r) / 2;

      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);

      // Merge the sorted subarrays
      merge(arr, l, m, r);
    }
  }

  // Print the array
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver program
  public static void main(String args[]) {
    int arr[] = { 6, 5, 12, 10, 9, 1 };

    MergeSort ob = new MergeSort();
    ob.mergeSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array:");
    printArray(arr);
  }
}

```
---

<h2><a href="https://www.programiz.com/dsa/quick-sort">5. Quick Sort </a></h2>
Quicksort is a divide-and-conquer algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element. Finally, elements are combined to form a sorted array.

---

<h3>Quick Sort is used when: </h3>

* the programming language is good for recursion
* time complexity matters
* space complexity matters

---

<h3>Quick Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n logn) </code></li>
    <li><code> Worst	O(n^2) </code></li>
    <li><code> Average O(n logn) </code></li>
<b> Space Complexity	</b>
    <li><code> O(log n) </code></li>
</ul>

---

<h3>Code:</h3>

```Java
// Quick sort in Java

import java.util.Arrays;

class Quicksort {

  // method to find the partition position
  static int partition(int array[], int low, int high) {
    
    // choose the rightmost element as pivot
    int pivot = array[high];
    
    // pointer for greater element
    int i = (low - 1);

    // traverse through all elements
    // compare each element with pivot
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {

        // if element smaller than pivot is found
        // swap it with the greatr element pointed by i
        i++;

        // swapping element at i with element at j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    // swapt the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(array, low, high);
      
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
    }
  }
}

// Main class
class Main {
  public static void main(String args[]) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));

    int size = data.length;

    // call quicksort() on array data
    Quicksort.quickSort(data, 0, size - 1);

    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}

```
---

<h2><a href="https://www.programiz.com/dsa/counting-sort">6. Counting Sort </a></h2>
Counting sort is a sorting algorithm that sorts the elements of an array by counting the number of occurrences of each unique element in the array. The count is stored in an auxiliary array and the sorting is done by mapping the count as an index of the auxiliary array.

---

<h3>Counting Sort is used when: </h3>

* there are smaller integers with multiple counts.
* linear complexity is the need.

---

<h3>Counting Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n + k) </code></li>
    <li><code> Worst	O(n + k) </code></li>
    <li><code> Average O(n + k) </code></li>
<b> Space Complexity	</b>
    <li><code> O(max) </code></li>
</ul>

---

<h3>Code:</h3>

```Java
// Counting sort in Java programming

import java.util.Arrays;

class CountingSort {
  void countSort(int array[], int size) {
    int[] output = new int[size + 1];

    // Find the largest element of the array
    int max = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i] > max)
        max = array[i];
    }
    int[] count = new int[max + 1];

    // Initialize count array with all zeros.
    for (int i = 0; i < max; ++i) {
      count[i] = 0;
    }

    // Store the count of each element
    for (int i = 0; i < size; i++) {
      count[array[i]]++;
    }

    // Store the cummulative count of each array
    for (int i = 1; i <= max; i++) {
      count[i] += count[i - 1];
    }

    // Find the index of each element of the original array in count array, and
    // place the elements in output array
    for (int i = size - 1; i >= 0; i--) {
      output[count[array[i]] - 1] = array[i];
      count[array[i]]--;
    }

    // Copy the sorted elements into original array
    for (int i = 0; i < size; i++) {
      array[i] = output[i];
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 4, 2, 2, 8, 3, 3, 1 };
    int size = data.length;
    CountingSort cs = new CountingSort();
    cs.countSort(data, size);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}

```

<h2><a href="https://www.programiz.com/dsa/radix-sort">7. Radix Sort</a></h2>
Radix sort is a sorting algorithm that sorts the elements by first grouping the individual digits of the same place value. Then, sort the elements according to their increasing/decreasing order.

---

<h3>Radix Sort is used when: </h3>

* places where there are numbers in large ranges.
* DC3 algorithm (Kärkkäinen-Sanders-Burkhardt) while making a suffix array.

---

<h3>Radix Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n + k) </code></li>
    <li><code> Worst	O(n + k) </code></li>
    <li><code> Average O(n + k) </code></li>
<b> Space Complexity	</b>
    <li><code> O(max) </code></li>
</ul>

---

<h3>Code:</h3>

```Java

// Radix Sort in Java Programming

import java.util.Arrays;

class RadixSort {

  // Using counting sort to sort the elements in the basis of significant places
  void countingSort(int array[], int size, int place) {
    int[] output = new int[size + 1];
    int max = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i] > max)
        max = array[i];
    }
    int[] count = new int[max + 1];

    for (int i = 0; i < max; ++i)
      count[i] = 0;

    // Calculate count of elements
    for (int i = 0; i < size; i++)
      count[(array[i] / place) % 10]++;

    // Calculate cumulative count
    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];

    // Place the elements in sorted order
    for (int i = size - 1; i >= 0; i--) {
      output[count[(array[i] / place) % 10] - 1] = array[i];
      count[(array[i] / place) % 10]--;
    }

    for (int i = 0; i < size; i++)
      array[i] = output[i];
  }

  // Function to get the largest element from an array
  int getMax(int array[], int n) {
    int max = array[0];
    for (int i = 1; i < n; i++)
      if (array[i] > max)
        max = array[i];
    return max;
  }

  // Main function to implement radix sort
  void radixSort(int array[], int size) {
    // Get maximum element
    int max = getMax(array, size);

    // Apply counting sort to sort elements based on place value.
    for (int place = 1; max / place > 0; place *= 10)
      countingSort(array, size, place);
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 121, 432, 564, 23, 1, 45, 788 };
    int size = data.length;
    RadixSort rs = new RadixSort();
    rs.radixSort(data, size);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}

```
---

<h2><a href="https://www.programiz.com/dsa/bucket-sort">8. Bucket Sort</a></h2>
Bucket Sort is a sorting algorithm that divides the unsorted array elements into several groups called buckets. Each bucket is then sorted by using any of the suitable sorting algorithms or recursively applying the same bucket algorithm.
Finally, the sorted buckets are combined to form a final sorted array.

---

<h3>Bucket Sort is used when: </h3>

* input is uniformly distributed over a range.
* there are floating point values

---

<h3>Bucket Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n + k) </code></li>
    <li><code> Worst	O(n^2) </code></li>
    <li><code> Average O(n) </code></li>
<b> Space Complexity	</b>
    <li><code> O(n + k) </code></li>
</ul>

---

<h3>Code:</h3>

```Java

// Bucket sort in Java

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
  public void bucketSort(float[] arr, int n) {
    if (n <= 0)
      return;
    @SuppressWarnings("unchecked")
    ArrayList<Float>[] bucket = new ArrayList[n];

    // Create empty buckets
    for (int i = 0; i < n; i++)
      bucket[i] = new ArrayList<Float>();

    // Add elements into the buckets
    for (int i = 0; i < n; i++) {
      int bucketIndex = (int) arr[i] * n;
      bucket[bucketIndex].add(arr[i]);
    }

    // Sort the elements of each bucket
    for (int i = 0; i < n; i++) {
      Collections.sort((bucket[i]));
    }

    // Get the sorted array
    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0, size = bucket[i].size(); j < size; j++) {
        arr[index++] = bucket[i].get(j);
      }
    }
  }

  // Driver code
  public static void main(String[] args) {
    BucketSort b = new BucketSort();
    float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
        (float) 0.51 };
    b.bucketSort(arr, 7);

    for (float i : arr)
      System.out.print(i + "  ");
  }
}

```

---

<h2><a href="https://www.programiz.com/dsa/heap-sort">9. Heap Sort </a></h2>
Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning. Repeat the same process for the remaining elements.
---

<h3>Heap Sort is used when: </h3>

* the smallest (shortest) or highest (longest) value is needed instantly.
* finding the order in statistics, dealing with priority queues in Prim's algorithm

---

<h3>Heap Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n logn) </code></li>
    <li><code> Worst	O(n logn) </code></li>
    <li><code> Average O(n logn) </code></li>
<b> Space Complexity	</b>
    <li><code> O(1) </code></li>
</ul>

---

<h3>Code:</h3>

```Java
// Heap Sort in Java
  
  public class HeapSort {
  
    public void sort(int arr[]) {
      int n = arr.length;
  
      // Build max heap
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
      }
  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        // Heapify root element
        heapify(arr, i, 0);
      }
    }
  
    void heapify(int arr[], int n, int i) {
      // Find largest among root, left child and right child
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
  
      if (l < n && arr[l] > arr[largest])
        largest = l;
  
      if (r < n && arr[r] > arr[largest])
        largest = r;
  
      // Swap and continue heapifying if root is not largest
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapify(arr, n, largest);
      }
    }
  
    // Function to print an array
    static void printArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    }
  
    // Driver code
    public static void main(String args[]) {
      int arr[] = { 1, 12, 9, 5, 6, 10 };
  
      HeapSort hs = new HeapSort();
      hs.sort(arr);
  
      System.out.println("Sorted array is");
      printArray(arr);
    }
  }

```

---

<h2><a href="https://www.programiz.com/dsa/shell-sort">10. Shell Sort </a></h2>
Shell sort is a generalized version of the insertion sort algorithm. It first sorts elements that are far apart from each other and successively reduces the interval between the elements to be sorted.
---

<h3>Shell Sort is used when: </h3>

* Insertion sort does not perform well when the close elements are far apart. Shell sort helps in reducing the distance between the close elements. Thus, there will be less number of swappings to be performed.
* calling a stack is overhead. uClibc library uses this sort.
* recursion exceeds a limit. bzip2 compressor uses it.

---

<h3>Shell Sort Complexity</h3>

<ul>
<b> Time Complexity	 </b>
    <li><code> Best	O(n logn) </code></li>
    <li><code> Worst	O(n^2) </code></li>
    <li><code> Average O(n logn) </code></li>
<b> Space Complexity	</b>
    <li><code> O(1) </code></li>
</ul>

---

<h3>Code:</h3>

```Java
// Shell sort in Java programming

import java.util.Arrays;

// Shell sort
class ShellSort {

  // Rearrange elements at each n/2, n/4, n/8, ... intervals
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

  // Driver code
  public static void main(String args[]) {
  int[] data = { 9, 8, 3, 7, 5, 6, 4, 1 };
  int size = data.length;
  ShellSort ss = new ShellSort();
  ss.shellSort(data, size);
  System.out.println("Sorted Array in Ascending Order: ");
  System.out.println(Arrays.toString(data));
  }
}

```

