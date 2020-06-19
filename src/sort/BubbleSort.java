package sort;

public class BubbleSort {
	
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
		bubbleSort(arr);
		printArrary(arr);
	}

	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length-1);
	}

	private static void bubbleSort(int[] arr, int end) {
		if (end > 0) {
			for (int i=1; i<=end; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
				}
			}
			bubbleSort(arr, end-1);
		}
	}

	private static void swap(int[] arr, int i, int i2) {
		int tmp = arr[i];
		arr[i] = arr[i2];
		arr[i2] = tmp;
	}

}
