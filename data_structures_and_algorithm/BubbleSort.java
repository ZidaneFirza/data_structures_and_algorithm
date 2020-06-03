package data_structures_and_algorithm;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j + 1] < arr[j]) {
					a = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = a;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 312, 2322, 400, 100, 99, 25, 32, 100000, 12312, 3123, 312 };
		int[] b = sort(a);

		for(int e: b)
			System.out.println(e);
	}

}
