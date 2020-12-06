import java.util.Scanner;

class solution {
	
	// creating membership function
	static boolean member( int[] integerArray, int number ) {
		for ( int i : integerArray ) {
			if ( i == number )
			return true;
		}
		return false;
	}
	
	// creating swapcase function
	static char swapCase( char character ) {
		if ( Character.isUpperCase( character ) )
		return Character.toLowerCase( character );
		return Character.toUpperCase( character );
	}
	
	public static void main ( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int length = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		String indicesString = input.nextLine();
		input.close();
		
		// generating indices
		String[] stringIndices = indicesString.split(" ");
		int[] indices = new int[2];
		for ( int i = 0; i < 2; i++ ) {
			indices[i] = Integer.parseInt( stringIndices[i] );
		}
		
		// generating string
		for ( int i = 0; i < length; i++ ) {
			if ( member( indices, i ) )
			System.out.print( swapCase( string.charAt(i) ) );
			else
			System.out.print( string.charAt(i) );
		}
	}
}
