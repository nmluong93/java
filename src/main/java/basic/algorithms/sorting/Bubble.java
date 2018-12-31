package basic.algorithms.sorting;

import static basic.algorithms.sorting.RunningClass.swap;

public class Bubble {

	public static void sort(int[] arr) {
		boolean isSorted = true;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				return;
			}

		}
	}

	public static void recursive(int[] arr, int lengh) {
		if (lengh == 1) {
			return;
		}
		for (int i = 0; i < lengh - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
		recursive(arr, lengh - 1);
	}


}
