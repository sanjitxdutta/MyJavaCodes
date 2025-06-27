import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double arr[] = new double[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextDouble();
        }
        
        System.out.println("The array: ");
        for(int i=0; i<n; i++){
            System.out.printf("%.2f\t", arr[i]);
        }
        System.out.println();

        Arrays.sort(arr, 0, n);

        System.out.println("The sorted array: ");
        for(int i=0; i<n; i++){
            System.out.printf("%.2f\t", arr[i]);
        }
        System.out.println();
    }
}
