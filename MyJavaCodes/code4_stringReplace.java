import java.util.Scanner;

public class code4_stringReplace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("The updated string is: " + s.replace(' ', '_'));
    }
}
