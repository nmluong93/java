package basic.algorithms.sorting;

public class Insertion {

	public static void sort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {

			int currentNumber = arr[i];

			int j = i - 1;
			while (j >= 0 && currentNumber < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentNumber;
		}
	}

	public static void recursive(int arr[], int length) {
		if (length <= 1) {
			return;
		}

		recursive(arr, length - 1);

		int last = arr[length - 1];

		int indexPrelast = length - 2;
		while (indexPrelast >= 0 && last < arr[indexPrelast]) {
			arr[indexPrelast + 1] = arr[indexPrelast];
			indexPrelast--;
		}
		arr[indexPrelast + 1] = last;
	}
}
