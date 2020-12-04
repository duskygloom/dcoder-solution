import java.util.Scanner;

class solution {
	
	public static void main( String[] args ) {
		
		// taking input
		Scanner input = new Scanner( System.in );
		String userInput = input.nextLine();
		input.close();
		String[] tempArray = userInput.split(" ");
		int total = Integer.parseInt( tempArray[0] );
		int member = Integer.parseInt( tempArray[1] );
		
		// checking and printing
		int required = total / 2;
		if ( member >= required )
		System.out.println( member - required );
		else
		System.out.println( member + required );
	}
}
