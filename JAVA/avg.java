import java.util.Scanner;

public class avg {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            int sub = sc.nextInt();
            sum += sub;
        }
        double avg = sum/5.0;
        System.out.printf("Average: %.2f", avg);
    }
}
