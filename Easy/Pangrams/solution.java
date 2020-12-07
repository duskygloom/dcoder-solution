import java.util.Scanner;

class solution {
	
	// creating function to check boolean array
	static boolean check( boolean[] booleanArray ) {
		for ( boolean i : booleanArray ) {
			if ( i == false )
			return false;
		}
		return true;
	}
	
	public static void main( String[] args ) {
		
		// taking input
		Scanner input = new Scanner( System.in );
		String string = input.nextLine().toLowerCase();
		input.close();
		
		// creating array to mark alphabets
		boolean[] array = new boolean[26];
		char[] charArray = string.toCharArray();
		for ( char i : charArray ) {
			if ( Character.isLowerCase(i) )
			array[ i - 'a' ] = true;
		}
		
		// printing
		if ( check( array ) )
		System.out.println( "YES" );
		else
		System.out.println( "NO" );
	}
}
