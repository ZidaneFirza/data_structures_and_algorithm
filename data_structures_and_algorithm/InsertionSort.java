package data_structures_and_algorithm;

public class InsertionSort {

	public static int[] sort(int[] arr) {
		int temp = 0;
		int index = 0;
		
		for(int i = 1; i < arr.length ; i++) {
			temp = arr[i];
			for(int j = i - 1; j > -1; j--) {
				if(arr[j] > temp) {
					arr[j + 1] = arr[j];
					index = j;
				}else {
					break;
				}		
			}
			if(arr[i] != temp) arr[index] = temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 4,9,13,5,41,78,35,45,32,77,1,5,3,7 };
		int[] b = sort(a);

		for (int e : b)
			System.out.println(e);
	}
}
