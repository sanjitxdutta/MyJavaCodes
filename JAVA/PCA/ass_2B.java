import java.util.Scanner;

class ass_2B{
    static long fact(int num){
        if(num < 0){
            System.out.println("ERROR!");
        }
        if (num <= 1){
            return num;
        }
        else{
            return num*fact(num - 1);
        }
    }

    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
}