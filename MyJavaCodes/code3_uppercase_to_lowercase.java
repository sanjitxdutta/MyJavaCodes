import java.util.Scanner;

class code3_uppercase_to_lowercase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("The updated string is: " + s.toLowerCase());
    }
}