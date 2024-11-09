import java.util.Scanner;

public class code2__IntegerDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("You entered an integer: " + number);
        } else {
            System.out.println("The input is not an integer.");
        }

        sc.close();
    }
}
