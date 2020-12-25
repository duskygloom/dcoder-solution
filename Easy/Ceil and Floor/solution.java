import java.util.Scanner;
import java.lang.Math;

class solution {

    public static void main(String[] args) {

        // taking input
        var input = new Scanner(System.in);
        var decimal = input.nextFloat();
        input.close();

        //printing
        System.out.printf("%d %d", (int) Math.ceil(decimal), (int) Math.floor(decimal));
    }
}
