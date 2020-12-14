import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int arraySize = input.nextInt();
		input.nextLine();
		String integers = input.nextLine();
		input.close();
		
		// creating array of integers
		String[] array = integers.split(" ");
		
		// checking for natural numbers
		boolean allNaturalNumbers = true;
		for ( String i : array ) {
			if ( Integer.parseInt(i) ) < 1 {
				allNaturalNumbers = false;
				break;
			}
		}
		
		// printing
		if ( allNaturalNumbers == true )
		System.out.println( "Yes" );
		else
		System.out.println( "No" );
	}
}
