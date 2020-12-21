import java.util.Scanner;

class solution {
	
	public static void main(String[] args) {
		
		// taking inputs and storing results
		var input = new Scanner(System.in);
		int testCases = input.nextInt();
		input.nextLine();
		var results = new String[testCases];
		
		for (int i = 0; i < testCases; i++) {
			String marks = input.nextLine();
			var tempArray = marks.split(" ");
			var array = new int[2];
			array[0] = Integer.parseInt(tempArray[0]);
			array[1] = Integer.parseInt(tempArray[1]);
			if ((array[0] > 70) && (array[1] > 50))
			results[i] = "Pass";
			else
			results[i] = "Fail";
		}
		
		// printing
		for (String i : results)
		System.out.println(i);
	}
}
