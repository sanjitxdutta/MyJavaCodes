import java.util.Scanner;

public class fracions {
    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i = min; i >= 1; i--){
            if(num % i == 0 && den % i == 0)
                return i;
        }
        return min;
    }

public static Fraction add(Fraction f1, Fraction f2){
    int numerator = f1.num * f2.den + f2.num * f1.den;
    int denominetor = f1.den * f2.den;
    Fraction f3 = new Fraction(numerator, denominetor);
    return f3;
}

    public static class Fraction{
        int num;
        int den;

        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
            /*if(num < den){
                if(den % num == 0){
                    den = den / num;
                    num = 1;
                }
            }*/
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction f2 = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction f3 = add(f1, f2);
        System.out.println(f3.num+"/"+f3.den);
    }
}
