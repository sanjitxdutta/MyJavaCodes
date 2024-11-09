import java.util.Scanner;

public class code12_factorial_using_while {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for factorial:");
        int num = sc.nextInt();

        int fact = 1;
        int i = num;

        if(num == 0 || num == 1){
            System.out.println("Factorial of " + num + " is: " + fact);
        }
        else{
            while(i >= 2){
                fact *= i;
                i--;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
}
