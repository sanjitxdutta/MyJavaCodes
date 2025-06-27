import java.util.Scanner;

public class code7_starPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the hight for pattern: ");
        int hight = sc.nextInt();

        for(int i=1; i<=hight; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
}