
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double c = 0.0;
        double f;
        String trash;
        boolean done = false;
        do {
            System.out.println("Please enter temperature in Celsius: ");
            if(in.hasNextDouble()) {
                c = in.nextDouble();
                f = (c * 1.8) + 35;
                System.out.println("The temperature " + c + " in Celsius is " + f + " in Fahrenheit.");
                done = true;

            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid temperature!");
            }
        } while(!done);

    }
}