package sort;

public class SelectionSort {
	
	// O(n2) : n제곱  
	
	private static void printArrary(int[] arr) {
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {2,6,1,3,5,7,4};
		printArrary(arr);
		selectionSort(arr);
		printArrary(arr);
	}

	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
	}

	private static void selectionSort(int[] arr, int start) {
		if (start < arr.length - 1) {
			int min_index = start;
			for (int i = start; i < arr.length; i++) {
				if (arr[i] < arr[min_index]) {
					min_index = i;
				}
			}
			swap(arr, start, min_index);
			selectionSort(arr, start+1);
		}
	}

	private static void swap(int[] arr, int start, int min_index) {
		int tmp = arr[start];
		arr[start] = arr[min_index];
		arr[min_index] = tmp;
	}

}
