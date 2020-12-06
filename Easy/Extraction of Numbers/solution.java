import java.util.Scanner;

class solution {
	
	public static void main ( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int numberWords = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		input.close();
		
		// seperating digits
		for ( char i : string.toCharArray() ) {
			if ( Character.isDigit(i) ) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
}
