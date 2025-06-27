class Student{
    int roll;
    String name;
    int marks;
}
public class stud {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Sanjit";
        s1.marks = 40;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Sagnik";
        s2.marks = 39;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Rohan";
        s3.marks = 40;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student stu : students){
            System.out.println(stu.name + ":" + stu.marks);
        }
    }
}
