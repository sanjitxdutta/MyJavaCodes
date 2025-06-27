import java.util.Scanner;

class ass_1C{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int num=0;
        
        for(int i = 0; i<5; i++){
            num = num + sc.nextInt();
        }

        float avg = num/5;

        System.out.printf("%.2f", avg);
    }
}