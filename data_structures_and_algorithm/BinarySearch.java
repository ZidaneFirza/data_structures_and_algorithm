package data_structures_and_algorithm;

public class BinarySearch {

	public static boolean search(int[] arr, int searchNumber) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		while (true) {
			mid = start + ((end - start) / 2);

			if (arr[mid] == searchNumber) {
				System.out.println("Array Index: " + mid);
				return true;
			} else if (arr[mid] < searchNumber) {
				start = mid + 1;
				if(start > end) return false;
			} else if (arr[mid] > searchNumber) {
				end = mid - 1;
				if(end < 0) return false;
			}
			
			if(start > end) return false;
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 10, 12, 15 };

		System.out.println(search(a, 12));
	}

}
