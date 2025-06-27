import java.util.*;
public class Math {
    public static void main(String [] args){
        int n, inp;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        try{
            n = sc.nextInt();
            for(int i=0; i<n; i++){
                inp = sc.nextInt();
                sum += inp;
            }
            System.out.println(sum);
        }
        catch(InputMismatchException e){
            System.out.println("ERROR!");
        }
    }
}
