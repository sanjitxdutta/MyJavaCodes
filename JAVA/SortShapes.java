import java.util.*;

class Shape{
    double area;
    void computeArea(){
        System.out.println("Computr areabased on specific shape.");
    }
    void displayShape(){
        System.out.println("Display Shape dimensions with area");
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

    @Override
    void displayShape(){ 
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

    @Override
    void displayShape(){ 
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

    @Override
    void displayShape(){
        System.out.printf("Triangle(%.2f,%.2f) Area: %.2f\n", h, b, super.area);
    }
}

public class SortShapes {
    public static Shape createShape(int type, Scanner sc){
        Shape obj = null;
        switch(type){
            case 1:
            obj = new Circle(sc.nextDouble());
            obj.computeArea();
            break;

            case 2:
            obj = new Rectangle(sc.nextDouble(), sc.nextDouble());
            obj.computeArea();
            break;

            case 3:
            obj = new Triangle(sc.nextDouble(), sc.nextDouble());
            obj.computeArea();
            break;

            default:
            System.out.printf("Ignore wrong shape type: %d.\n", type);
            break;
        }
        return obj;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Shape Sheets[] = new Shape[50];
        int i = 0, n, sheetType;
        Shape s;

        while(sc.hasNextInt()){
            sheetType = sc.nextInt();
            s = createShape(sheetType, sc);
            if(s != null)
                Sheets[i++] = s;
        }
        n = i;
        Arrays.sort(Sheets, 0, n, new Comparator<Shape>(){
            @override
            public int compare(Shape s1, Shape s2){
                if(s1.area > s2.area)
                    return 1;
                else if(s2.area > s1.area)
                    return -1;
                else
                    return 0;
            }
        });

        for (i=0; i<n; i++) {
            System.out.print(i+": ");
            Sheets[i].displayShape();
        }  
    }
}
