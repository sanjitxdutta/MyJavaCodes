import java.util.Scanner;

public class code8_sum_of_first_n_even_numbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tne number of even numbers:");
        int num = sc.nextInt();

        int sum = 0;
        int i = num;

        while(i >= 1){
            sum += (i*2);
            i --;
        }

        System.out.println("The sum of first " + num + " even natural numbers: " + sum + ".");
    }
}
