import java.util.Scanner;

class solution {
	
	public static void main(String[] args) {
		
		// taking input
		var input = new Scanner(System.in);
		char character = input.nextLine().charAt(0);
		input.close();
		
		// printing
		System.out.println((int) character);
	}
}
