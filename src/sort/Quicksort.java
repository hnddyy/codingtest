package sort;

public class Quicksort {
	
	// O(nlogn)
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if (start < part2 - 1) {
			quickSort(arr, start, part2 -1);
		}
		if (part2 < end) {
			quickSort(arr, part2, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		while(start <= end) {
			while (arr[start] < pivot) start++;
			while (arr[end] > pivot) end--;
			if (start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	private static void printArrary(int[] arr) {
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {2,6,1,3,5,7,4};
		printArrary(arr);
		quickSort(arr);
		printArrary(arr);
	}

}
