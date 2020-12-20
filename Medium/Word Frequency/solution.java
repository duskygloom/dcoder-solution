import java.util.Scanner;

class solution {
	
	// linear search function
	static boolean search (String toSearch, String[] array) {
		for (String i : array) {
			if (toSearch.equals(i))
			return true;
		}
		return false;
	}
	
	// count function
	static int count (String element, String[] array) {
		int counter = 0;
		for (String i : array) {
			if (element.equals(i))
			counter++;
		}
		return counter;
	}
	
	public static void main (String[] args) {
		
		// taking inputs
		var input = new Scanner (System.in);
		int numberWords = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		input.close();
		
		// seperating substrings and creating uniqueArray
		var substrings = string.split(" ");
		var uniqueArray = new String [numberWords];
		int index = 0;
		for (String i : substrings) {
			if (search (i, uniqueArray) == false) {
				uniqueArray [index] = i;
				index++;
			}
		}
		
		// sorting based on frequency
		for (int i = 1; i < numberWords; i++) {
			if (uniqueArray[i] == null)
			break;
			int j = i - 1;
			while (j >= 0 && count( uniqueArray[j], substrings ) < count( uniqueArray[j+1], substrings )) {
				String temp = uniqueArray[j];
				uniqueArray[j] = uniqueArray[j+1];
				uniqueArray[j+1] = temp;
				j--;
			}
		}
		
		// printing
		for (String i : uniqueArray) {
			if (i == null)
			break;
			System.out.printf ("%s ", i);
		}
	}
}
