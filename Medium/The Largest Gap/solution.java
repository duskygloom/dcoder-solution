import java.util.Scanner;

class solution {
	
	// creating max function
	static int max(int[] array) {
		int maximum = array[0];
		for (int i : array) {
			if (i > maximum)
			maximum = i;
		}
		return maximum;
	}
	
	// creating min function
	static int min(int[] array) {
		int minimum = array[0];
		for (int i : array) {
			if (i < minimum)
			minimum = i;
		}
		return minimum;
	}
	
	public static void main(String[] args) {
		
		// taking inputs
		var input = new Scanner(System.in);
		int arraySize = input.nextInt();
		input.nextLine();
		String elements = input.nextLine();
		input.close();
		
		// splitting elements
		var array = new int[arraySize];
		var tempArray = elements.split(" ");
		for (int i = 0; i < arraySize; i++)
		array[i] = Integer.parseInt(tempArray[i]);
		
		// counting difference
		int highestDifference = max(array) - min(array);
		
		// printing
		System.out.println(highestDifference);
	}
}
