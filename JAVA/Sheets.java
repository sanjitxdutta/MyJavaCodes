import java.util.Scanner;

class Shape{
    double area;
    void computeArea(){
        System.out.println("Computr areabased on specific shape.");
    }
    void displayArea(){
        System.out.println("Display shape dimensions with area.");
    }
}

class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }

    @override
    void computeArea(){
        super.area = Math.PI * r * r;
    }

    @override
    void displayArea(){
        System.out.printf("Circle(%.2f) Area: %.2f\n", r, super.area);
    }
}

class Rectangle extends Shape{
    double l;
    double b;
    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }

    @override
    void computeArea(){
        super.area = l * b;
    }

    @override
    void displayArea(){
        System.out.printf("Rectangle(%.2f,%.2f) Area: %.2f\n", l, b, super.area);
    }
}

class Triangle extends Shape{
    double h;
    double b;
    Triangle(double h, double b){
        this.h = h;
        this.b = b;
    }

    @override
    void computeArea(){
        super.area = 0.5 * h * b;
    }

    @override
    void displayArea(){
        System.out.printf("Triangle(%.2f,%.2f) Area: %.2f\n", h, b, super.area);
    }
}

public class Sheets {
    public static Shape createShape(int type, Scanner sc){
        Shape obj = null;

        switch(type){
            case 1:
                System.out.println("Circle Detected.");
                obj = new Circle(sc.nextDouble());
                obj.computeArea();
                break;
            case 2:
                System.out.println("Rectangle Detected.");
                obj = new Rectangle(sc.nextDouble(), sc.nextDouble());
                obj.computeArea();
                break;
            case 3:
                System.out.println("Triangle Detected.");
                obj = new Triangle(sc.nextDouble(), sc.nextDouble());
                obj.computeArea();
                break;
            default:
                System.out.printf("Ignoring wrong types: %d.\n", type);
                obj = null;
                break;
        }
        return obj;
    }
    public static void main(String [] args){
        Shape shapes[] = new Shape[50];
        int n, i=0, sheetType;
        Shape s;

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            sheetType = sc.nextInt();
            s = createShape(sheetType, sc);
            if(s != null)
                shapes[i++] = s;
        }

        n = i;
        for(i=0; i<n; i++){
            System.out.print(i + ": ");
            shapes[i].displayArea();
        }
    }
}
