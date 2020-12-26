import java.util.Scanner;

class solution {

    public static void main(String[] args) {

        // taking inputs
        var input = new Scanner(System.in);
        String info = input.nextLine();
        input.close();

        // seperating info
        var temp = info.split(" ");
        int alex = Integer.parseInt(temp[1]);
        int ryan = Integer.parseInt(temp[2]);

        // printing
        if (alex > ryan)
        System.out.println("Alex");
        else if (ryan > alex)
        System.out.println("Ryan");
        else
        System.out.println("Draw");
    }
}
