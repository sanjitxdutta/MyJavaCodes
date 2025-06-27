import java.util.Scanner;

class Course{
    private String code;
    private String name;

    Course(){
        this.code = "";
        this.name = "";
    }

    Course(String code, String name){
        this.code = code;
        this.name = name;
    }

    void setCourse(String code, String name){
        this.code = code;
        this.name =  name;
    }

    String getCourse(){
        return (code + " | " + name);
    }
}

class ass_2C{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        String code, name;

        code =  sc.nextLine();
        name = sc.nextLine();
        Course c1 = new Course(code, name);

        code = sc.nextLine();
        name = sc.nextLine();
        Course c2 = new Course();
        c2.setCourse(code, name);

        System.out.printf("Course:\n%s\n%s\n", c1.getCourse(), c2.getCourse());
    }
}
