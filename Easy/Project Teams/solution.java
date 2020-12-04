import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking input
		Scanner input = new Scanner( System.in );
		int student = input.nextInt();
		input.close();
		
		// printing
		System.out.println( student / 3 );
	}
}
