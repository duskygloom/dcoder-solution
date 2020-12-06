import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking input
		Scanner input = new Scanner( System.in );
		double celsius = input.nextDouble();
		input.close();
		
		// calculating
		int fahrenheit = (int) ( 32.0 + ( celsius * 1.8 ) );
		
		// printing
		System.out.println( fahrenheit );
	}
}
