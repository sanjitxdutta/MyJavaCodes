import java.util.Scanner;

public class code11_factorial_using_for {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for factorial:");
        int num = sc.nextInt();

        int fact = 1;

        if(num == 0 || num == 1){
            System.out.println("Factorial of " + num + " is: " + fact);
        }
        else{
            for(int i=num; i>1; i--){
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
}
