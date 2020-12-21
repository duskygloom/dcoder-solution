import java.util.Scanner;

class solution {
	
	public static void main(String[] args) {
		
		// taking inputs and storing results
		var input = new Scanner(System.in);
		int testCases = input.nextInt();
		input.nextLine();
		var results = new int[testCases];
		
		for (int i = 0; i < testCases; i++) {
			var number = input.nextLine();
			int result = Integer.parseInt(number.substring(0, 1)) + Integer.parseInt(number.substring(number.length() - 1));
			results[i] = result;
		}
		input.close();
		
		// printing
		for (int i : results)
		System.out.println(i);
	}
}
