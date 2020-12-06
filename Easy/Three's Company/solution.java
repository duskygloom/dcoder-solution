import java.util.Scanner;

class solution {
	
	// function to replicate characters
	static String charRepeat( char character, int times ) {
		String toReturn = "";
		for ( int i = 0; i < times; i++ ) {
			toReturn += character;
		}
		return toReturn;
	}
	
	public static void main( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int numberLetters = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		input.close();
		
		// printing
		for ( int i = 0; i < numberLetters; i++ ) {
			System.out.print( charRepeat( string.charAt(i), 3 ) );
		}
	}
}
