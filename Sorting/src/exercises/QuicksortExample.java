package exercises;

public class QuicksortExample {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] {11,4,5,33,64,-243,435,34};
		System.out.println("Sorting Integers...");
		System.out.println("BEFORE: " + arrayToString(intArray));
		Quicksort.sort(intArray);
		System.out.println("AFTER: " + arrayToString(intArray));
	}
	
	public static String arrayToString(Object[] array) {
		String s = "";
		if(array.length > 0) {
			for (Object o : array) {
				s += o.toString() + ",";
			}
			//removes the last character ","
			s = s.substring(0, s.length() - 1);
		}
		return s;
	}

}
