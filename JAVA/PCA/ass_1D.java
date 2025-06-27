import java.util.Scanner;

class ass_1D{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int day;
        do{
            day = sc.nextInt();
            switch(day){
                case 1:
                System.out.println("Monday");
                break;

                case 2:
                System.out.println("Tuesday");
                break;

                case 3:
                System.out.println("Wednesday");
                break;

                case 4:
                System.out.println("Thursday");
                break;

                case 5:
                System.out.println("Friday");
                break;

                case 6:
                System.out.println("Saturday");
                break;

                case 7:
                System.out.println("Sunday");
                break;

                case 0:
                break;

                default:
                System.out.println("ERROR!");
                break;
            }
    }while(day!=0);
    }
}