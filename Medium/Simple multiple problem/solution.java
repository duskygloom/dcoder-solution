/*
Please note that something is wrong with the concept I used.
I mean I can't find any logical error, but dcoder seems to have problem with this code.
Please mention if you find any flaw.
*/

import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking inputs
		var input = new Scanner( System.in );
		int testCases = input.nextInt();
		var answers = new int[ testCases ];
		for ( int i = 0; i < testCases; i++ ) {
			var numbers = input.nextLine();
			
			// calculating
			var numbersArray = numbers.split(" ");
			int firstNumber = Integer.parseInt( numbersArray[0] );
			int secondNumber = Integer.parseInt( numbersArray[1] );
			int multiplier = 1;
			while (true) {
				if ( ( multiplier * firstNumber ) % secondNumber == 0 ) {
					answers[i] = multiplier;
					break;
				}
				else
				multiplier++;
			}
		}
		
		// printing answers
		for ( int i : answers )
		System.out.println(i);
	}
}
