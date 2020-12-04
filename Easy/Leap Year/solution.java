/*
I don't know what is wrong with this code
This seems alright to me
But all test cases are showing incorrect
If you manage to correct it, refer it to me
*/

import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int testCases = input.nextInt();
		input.nextLine();
		int[] array = new int[ testCases ];
		
		for ( int i = 0; i < testCases; i++ ) {
			array[i] = input.nextInt();
			input.nextLine();
		}
		input.close();
		
		// checking and printing
		for ( int i : array ) {
			if ( i % 4 == 0 ) {
				if ( i % 100 == 0 ) {
					if ( i% 400 == 0 )
					System.out.println( "Yes" );
					else
					System.out.println( "No" );
				}
				else
				System.out.println( "Yes" );
			}
			else
			System.out.println( "No" );
		}
	}
}
