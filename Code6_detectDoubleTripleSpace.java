import java.util.Scanner;

public class Code6_detectDoubleTripleSpace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length() - 1; i++) {
            if (i < s.length() - 2 && s.charAt(i) == ' ' && s.charAt(i + 1) == ' ' && s.charAt(i + 2) == ' ') {
                System.out.println("Triple space detected at index " + i);
                i += 2;
            }
            else if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                System.out.println("Double space detected at index " + i);
            }
        }

        System.out.println("Finished checking the input.");
    }
}
