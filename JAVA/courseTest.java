import java.util.*;
class course{
    String code;
    String name;
    course(String name, String code){
        this.name = name;
        this.code = code;
    }
    course(){
        this.name = "";
        this.code = "";
    }
    String getCourse(){
        return (code + " | " + name);
    }
    void setCourse(String name, String code){
        this.name = name;
        this.code = code;
    }
}

public class courseTest {
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        String name = sc.nextLine();

        course c1 = new course (name, code); // Parametrized Constructor

        String code1 = sc.nextLine();
        String name1 = sc.nextLine();
        course c2 = new course(); // non Parametrized Constructor
        c2.setCourse(name1, code1); 

        System.out.printf("Courses:\n%s\n%s\n", c1.getCourse(), c2.getCourse());
    }    
}
