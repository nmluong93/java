package basic.algorithms.sorting;

public class Insertion {

	public static void sort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {

			int currentNumber = arr[i];
			
			int j = i -1;
			while(j >= 0 && currentNumber < arr[j]) {
				arr[j + 1] = arr[j];
				j --;
			}
			arr[j + 1] = currentNumber;
		}
	}
}
