import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking inputs
		var input = new Scanner( System.in );
		int testCases = input.nextInt();
		input.nextLine();
		var strings = new String[ testCases ];
		for ( int i = 0; i < testCases; i++ )
		strings[i] = input.nextLine();
		input.close();
		
		// printing
		for ( String i : strings )
		System.out.println( i.toUpperCase() );
	}
}
