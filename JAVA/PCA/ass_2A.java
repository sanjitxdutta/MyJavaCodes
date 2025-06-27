import java.util.Scanner;

class Rectangle{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double area(){
        return length*breadth;
    }
}

class ass_2A{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle(length, breadth);

        System.out.println(r.area());
        
    }
}