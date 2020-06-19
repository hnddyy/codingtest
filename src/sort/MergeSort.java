package sort;

public class MergeSort {
	
	// O(nlogn)
	// 시간복잡도가 퀵정렬과 같지만 공간이 필요하기 때문에 공간이 필요할때는 퀵정렬 사용  
	
	public static void main(String[] args) {
		int[] arr = {2,6,1,3,5,7,4};
		printArrary(arr);
		mergeSort(arr);
		printArrary(arr);
	}

	private static void mergeSort(int[] arr) {
		// 저장공간이 필요하다
		int[] tmp = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if(start < end) {
			int mid = (start + end) /2;
			mergeSort(arr, tmp, start, mid);
			mergeSort(arr, tmp, mid+1, end);
			merge(arr, tmp, start, mid, end);
		}
	}

	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for (int i=start; i<=end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid + 1;
		int index  = start;
		while (part1 <=mid && part2 <=end) {
			if(tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for (int i=0; i<= mid - part1; i++) {
			arr[index + i] = tmp[part1 + i];
		}
	}

	private static void printArrary(int[] arr) {
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
