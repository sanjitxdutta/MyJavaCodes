import java.util.Scanner;

class methodOverload{
    int n = 0;
    double d = 0.00;
    int square(int n){
        return n * n;
    }
    double square(double d){
        return d * d;
    }
}

public class methodOverloadTest {
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();

        methodOverload mol = new methodOverload();

        System.out.printf("Square of %d is: %d.\n", n, mol.square(n));
        System.out.printf("Square of %.2f is: %.2f.\n", d, mol.square(d));              //method overload
    }
}
