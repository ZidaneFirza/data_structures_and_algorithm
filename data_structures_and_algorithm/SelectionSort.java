package data_structures_and_algorithm;

public class SelectionSort {

	public static int[] sort(int[] arr) {
		int a = 0;
		int lowest = arr[0];
		int lowestIndex = 0;

		for (int j = 0; j < arr.length - 1; j++) {
			lowest = arr[j];
			lowestIndex = j;

			for (int i = j; i < arr.length; i++) {
				if (lowest > arr[i]) {
					lowest = arr[i];
					lowestIndex = i;
				}
			}

			a = arr[j];
			arr[j] = arr[lowestIndex];
			arr[lowestIndex] = a;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 312, 2322, 400, 100, 99, 25, 32, 1, 100000, 12312, 3123, 312 };
		int[] b = sort(a);

		for (int e : b) System.out.println(e);
	}

}
