import java.util.Scanner;

class solution {
	
	public static void main ( String[] args ) {
		
		// taking inputs
		Scanner input = new Scanner( System.in );
		int numberElements = input.nextInt();
		input.nextLine();
		String elements = input.nextLine();
		input.close();
		
		// creating array
		String[] stringArray = elements.split( " ", numberElements );
		int[] array = new int[ numberElements ];
		for ( int i = 0; i < numberElements; i++ ) {
			array[i] = Integer.parseInt( stringArray[i] );
		}
		
		// sum of elements and max number
		int sumElements = 0;
		int maxElement = 0;
		for ( int i : array ) {
			sumElements += i;
			if ( i > maxElement )
			maxElement = i;
		}
		
		// printing remainder
		System.out.println( sumElements % maxElement );
	}
}
