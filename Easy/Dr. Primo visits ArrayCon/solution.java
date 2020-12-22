import java.util.Scanner;

class solution {
	
	// function to detect prime
	static boolean isPrime(int integer) {
		if (integer == 1)
		return false;
		
		for (int i = 2; i < integer; i++) {
			if (integer % i == 0)
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		// taking inputs
		var input = new Scanner(System.in);
		int arraySize = input.nextInt();
		input.nextLine();
		var elements = input.nextLine().split(" ");
		input.close();
		
		// getting integer array
		var integers = new int[arraySize];
		for (int i = 0; i < arraySize; i++)
		integers[i] = Integer.parseInt(elements[i]);
		
		// searching for primes
		int numberPrimes = 0;
		for (int i : integers) {
			if (isPrime(i))
			numberPrimes++;
		}
		
		// printing
		System.out.println(numberPrimes);
	}
}
