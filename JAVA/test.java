import java.util.Scanner;

class Rectangle{
    double length;
    double breadth;

    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    double computeArea(){
        return length * breadth;
    }
}

public class test {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);

        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Rectangle r1 = new Rectangle(l, b);
        System.out.println(r1.computeArea());
    }
}
