import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int testCases = input.nextInt();
		input.nextLine();
		double[] array = new double[ testCases ];
		for ( int i = 0; i < testCases; i++ ) {
			array[i] = input.nextDouble();
		}
		input.close();
		
		// rounding and printing
		for ( double i : array ) {
			System.out.format( "%.2f", i );
			System.out.println();
		}
	}
}
