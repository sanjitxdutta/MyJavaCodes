import java.util.Scanner;

interface Shapes{
    public double computeArea();
}

class Circle implements Shapes{
    double r;
    Circle(double r){
        this.r = r;
    }
    @override
    public double computeArea(){
        return Math.PI * r * r;
    }
}

class Rectangle implements Shapes{
    double l;
    double b;
    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    @override
    public double computeArea(){
        return l * b;
    }
}

public class ShapeDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sheetType;
        Shapes S;
        while(sc.hasNextInt()){
            sheetType = sc.nextInt();
            switch(sheetType){
                case 1:
                S = new Circle(sc.nextDouble());
                System.out.printf("Circle: %.2f\n", S.computeArea());
                break;

                case 2:
                S = new Rectangle(sc.nextDouble(), sc.nextDouble());
                System.out.printf("Rectangle: %.2f\n", S.computeArea());
                break;

                case 0:
                System.out.println("Exiting....");
                System.exit(0);
            }
        }
    }
}
