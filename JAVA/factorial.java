import java.util.Scanner;

class fact{
    long fact = 1;
    long fact(int n){
        if(n < 0 || n > 20){
            System.out.println("ERROR\n");
            System.exit(-1);
            return -1;
        }
        else if( n == 1 || n == 0){
            return fact;
        }
        else{
            return n * fact (n - 1);
        }
    }
}

class factorial
{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact obj = new fact ();
        long result = obj.fact(n);
        System.out.println("Factorial of " + n + " is " + result + ".\n");
    }
}