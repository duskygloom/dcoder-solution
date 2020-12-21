import java.util.Scanner;

class solution {
	
	public static void main(String[] args) {
		
		// taking inputs
		var input = new Scanner(System.in);
		int arraySize = input.nextInt();
		input.nextLine();
		String integers = input.nextLine();
		input.close();
		
		// creating integer array
		var tempArray = integers.split(" ");
		var array = new int[arraySize];
		for (int i = 0; i < arraySize; i++)
		array[i] = Integer.parseInt(tempArray[i]);
		
		// printing
		for (int i = 0; i < arraySize; i++) {
			int element = array[i];
			if ((i % 2 == 1) && (element % 2 == 0))
			System.out.printf("%d ", element);
		}
	}
}
