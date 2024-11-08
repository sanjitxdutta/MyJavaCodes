import java.util.Scanner;

public class code5_nameReplace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String s = sc.nextLine();
        String s1 = "Dear <|name|>, thanks a lot.";
        System.out.println("Original string: \"Dear <|name|>, thanks a lot.\"");

        System.out.println("The updated string is: \"" + s1.replace("<|name|>", s) + "\"");
    }
}