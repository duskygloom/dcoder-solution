import java.util.Scanner;

class solution {
    
    public static void main(String[] args) {

        // taking input
        var input = new Scanner(System.in);
        var info = input.nextLine();
        input.close();

        // splitting info
        var temp = info.split(" ");
        var minimum = Float.parseFloat(temp[0]);
        var user = Float.parseFloat(temp[1]);

        // printing
        if (user < minimum)
        System.out.println("No");
        else
        System.out.println("Yes");
    }
}
