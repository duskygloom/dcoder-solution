import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int testCases = input.nextInt();
		input.nextLine();
		String[][] array = new String[ testCases ][2];
		for ( int i = 0; i < testCases; i++ ) {
			array[i] = input.nextLine().split( " ", 2 );
		}
		input.close();
		
		// checking and printing
		for ( String[] i : array ) {
			if ( i[0].contains(i[1]) ) {
				System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}

	}

}
