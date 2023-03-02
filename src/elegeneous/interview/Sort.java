package elegeneous.interview;

import org.junit.jupiter.api.Test;

public class Sort {
	void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	
	@Test
	void bubbleSortTest() {
		int[] arr = {5, 1, 4, 2, 8};
		bubbleSort(arr);
	}
}
