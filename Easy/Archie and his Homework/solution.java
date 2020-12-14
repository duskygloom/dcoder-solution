import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking input
		Scanner input = new Scanner( System.in );
		String integers = input.nextLine();
		input.close();
		
		// splitting numerator and denominator
		String[] integersArray = integers.split(" ");
		int numerator = Integer.parseInt( integersArray[0] );
		int denominator = Integer.parseInt( integersArray[1] );
		
		// calculation
		int divisor = 2;
		while ( divisor <= numerator ) {
			if ( numerator % divisor == 0 && denominator % divisor == 0 ) {
				numerator = numerator / divisor;
				denominator = denominator / divisor;
			}
			else
			divisor++;
		}
		
		// printing
		System.out.printf( "%d %d", numerator, denominator );
	}
}
