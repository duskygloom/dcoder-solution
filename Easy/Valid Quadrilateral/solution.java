import java.util.Scanner;

class solution {
	
	public static void main(String[] args) {
		
		// taking inputs
		var input = new Scanner(System.in);
		int testCases = input.nextInt();
		input.nextLine();
		var outputs = new String[testCases];
		
		for (int i = 0; i < testCases; i++) {
			
			// splitting integers
			int sum = 0;
			var angles = input.nextLine().split(" ");
			
			// storing outputs
			for (int j = 0; j < 4; j++)
			sum += Integer.parseInt(angles[j]);
			if (sum == 360)
			outputs[i] = "YES";
			else
			outputs[i] = "NO";
		}
		input.close();
		
		// printing
		for (String i : outputs)
		System.out.println(i);
	}
}
