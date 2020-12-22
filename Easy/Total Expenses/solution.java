import java.util.Scanner;

class solution {
	
	public static void main(String[] args) {
		
		// taking inputs and storing payments
		var input = new Scanner(System.in);
		int testCases = input.nextInt();
		input.nextLine();
		var payments = new float[testCases];
		
		for (int i = 0; i < testCases; i++) {
			float payment = (float) input.nextInt();
			if (payment > 1000.0)
			payment -= payment / 10.0;
			payments[i] = payment;
		}
		input.close();
		
		// printing
		for (float i : payments)
		System.out.printf("%.2f\n", i);
	}
}
