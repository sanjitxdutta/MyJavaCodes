import java.util.Scanner;

public class code10_reverse_mutiplicationTable {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for the multiplication table:");
        int num = sc.nextInt();

        for(int i=10; i>=1; i--){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
