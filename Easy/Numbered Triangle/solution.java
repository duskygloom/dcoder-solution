import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking input
		Scanner input = new Scanner( System.in );
		int integer = input.nextInt();
		input.close();
		
		// printing pattern
		for ( int i = 1; i <= integer; i++ ) {
			for ( int j = 1; j <= i; j++ ) {
				if ( j == i )
				System.out.println(j);
				else
				System.out.print( (String) j + " " );
			}
		}
	}
}
