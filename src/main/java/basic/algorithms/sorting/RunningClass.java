package basic.algorithms.sorting;

public class RunningClass {

	private static final int[] UNSORTED_ARRAY = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

	public static void main(String[] args) {

		checkBubbleSortRecursive();
	}

	private static void checkInsertionSort() {
		int[] array = UNSORTED_ARRAY;

		printArray(array);

		Insertion.sort(array);

		printArray(array);

	}

	private static void checkBubbleSort() {

		int[] array = UNSORTED_ARRAY;

		printArray(array);

		Bubble.sort(array);

		printArray(array);
	}

	private static void checkBubbleSortRecursive() {

		int[] array = UNSORTED_ARRAY;

		printArray(array);

		Bubble.recursive(array, array.length);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
