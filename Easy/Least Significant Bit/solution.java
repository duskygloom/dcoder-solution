import java.util.Scanner;

class solution {
	
	public static void main(String[] args) {
		
		// taking inputs
		var input = new Scanner(System.in);
		int testCases = input.nextInt();
		input.nextLine();
		var outputs = new String[testCases];
		
		for (int i = 0; i < testCases; i++) {
			int integer = input.nextInt();
						
			// storing outputs
			if (integer % 2 == 1)
			outputs[i] = "Yes";
			else
			outputs[i] = "No";
		}
		input.close();
		
		// printing
		for (String i : outputs)
		System.out.println(i);
	}
}
