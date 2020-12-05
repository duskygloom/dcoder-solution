import java.util.Scanner;
import java.lang.StringBuilder;

class solution {
  
  public static void main ( String[] args ) {
    
    // taking input
    Scanner input = new Scanner( System.in );
    int userInput = input.nextInt();
    input.close();
    
    // printing
    String alphabets = "abcdefghijklmnopqrstuvwxyz";
    String toReverse = alphabets.substring( 0, userInput );
    String toPrint = new StringBuilder( toReverse ).reverse().toString();
    System.out.println( toPrint );
  }
}
