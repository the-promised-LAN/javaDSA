package javaDSA;

/**
 * Static class containing different sorting algorithms for
 * integer arrays (can be adapted to other data structures)
 * Includes:
 * - Quick Sort
 * - Merge Sort
 * - Insertion Sort
 * - Selection Sort
 * - Radix Sort
 * - Bubble Sort
 * - Heap Sort
 * @author the-promised-LAN
 *
 */
public class Sorts {

	/**
	* Implementation of QuickSort algorithm.
	* Pivot takes as the last element in the array!
	 */
	public static void quickSort(int arr[], int start, int end) {
		if (end < start) {
			return;
		}

		int pivot = partition(arr, start, end);

		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, start); 
	}
	
	/**
	* Helped method for quickSort()
	*
	 */
	private static int partition(int arr[] int start, int end) {
		int pivot = arr[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (arr[j] < pivot) {
				swap(arr, ++i, j);
			}
		}

		//Swap pivot into the correct place and return the  pivot
		swap(arr, ++i, end);
		return arr[i];
	}
	
	// TODO
	public static void mergeSort(int arr[], int start, int end) {
		
	}
	
	// TODO
	public static void insertionSort(int arr[]) {
		
	}
	
	// TODO
	public static void selectionSort(int arr[]) {
		
	}
	
	// TODO
	public static void radixSort(int arr[]) {
	
	}
	
	// TODO
	public static void bubbleSort(int arr[]) {
		
	}
	
	// TODO
	public static void heapSort(Heap heap) {
		
	}
	
	/**
	* Helper method swapping two items in an array
	 */
	private void swap (int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
