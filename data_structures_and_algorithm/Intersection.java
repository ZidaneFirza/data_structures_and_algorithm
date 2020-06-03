package data_structures_and_algorithm;

import java.util.ArrayList;

public class Intersection {

	public static ArrayList<Integer> find(int[] arr1, int[] arr2) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					result.add(arr1[i]);
					break;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 4, 6, 7 };
		int[] arr2 = { 1, 4, 7, 3, 8 };

		ArrayList<Integer> intersection = find(arr1, arr2);
		System.out.println(intersection);
	}

}
