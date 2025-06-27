import java.util.Scanner;

interface Number{
    int findSqr(int i);
}

class A implements Number{
    int n;
    A(){
        n = 0;
    }
    public int findSqr(int n){
        return n * n;
    }
}

public class SqrDemo {
    public static void main(String [] args){
        A a = new A();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(a.findSqr(i));
    }
}
