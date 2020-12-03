// importing Scanner
import java.util.Scanner;

// creating class and objects
class solution {
	
	// main method
	public static void main( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int howMany = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		input.close();
		
		// creating array
		String[] array = string.split( " ", howMany );
		
		// swapping and printing
		for ( int i = howMany - 1; i >= 0; i-- )
		System.out.print( array[i] + " " );
	}
}
