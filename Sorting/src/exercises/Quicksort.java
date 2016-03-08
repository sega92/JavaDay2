package exercises;

public class Quicksort {
	public static <T extends Comparable<? super T>> void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}
	
	public static <T extends Comparable<? super T>> void sort(T[] array, int left0, int right0) {
		int left = left0;
		int right = right0 + 1;
		T pivot, temp;
		
		pivot = array[left0];
		
		do {
			do
				left++;
			while (left <= right0 && array[left].compareTo(pivot) < 0);
			
			do
				right--;
			while (array[right].compareTo(pivot) > 0);
			
			if (left < right) {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		} while (left <= right);
		
		temp = array[left0];
		array[left0] = array[right];
		array[right] = temp;
		
		if (left0 < right) sort (array, left0, right);
		if (left < right0) sort (array, left, right0);
	}
}
