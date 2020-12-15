import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class solution {
	
	public static void main (String[] args) {
		
		// taking inputs
		var input = new Scanner( System.in );
		int testCases = input.nextInt();
		var answers = new String[ testCases ];
		for ( int i = 0; i < testCases; i++ ) {
			int numberDigits = input.nextInt();
			input.nextLine();
			String integers = input.nextLine();
			
			// sorting
			String[] integersArray = integers.split(" ");
			Arrays.sort( integersArray, Collections.reverseOrder() );
			answers[i] = String.join( "", integersArray );
		}
		input.close();
		
		// printing answers
		for ( String i : answers )
		System.out.println(i);
	}
}
