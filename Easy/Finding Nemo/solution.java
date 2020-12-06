import java.util.Scanner;

class solution {
	
	public static void main ( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int numberWords = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		input.close();
		
		// creating list of words
		String[] words = string.split( " ", numberWords );
		
		// finding and printing Nemo
		for ( int i = 0; i < numberWords; i++ ) {
			if ( words[i].equals("Nemo") ) {
			System.out.println( i + 1 );
			break;
			}
		}
	}
}
