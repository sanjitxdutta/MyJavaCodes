import java.util.*;

class myThread implements Runnable{
    int num;
    myThread(int num){
        this.num = num;
    }

    public void run(){
        System.out.println("Factorial thread started.");
        if(num < 0){
            System.out.println("Factorial Thread: ERROR!");
        }
        else{
            long fact = 1;
            for(int i=num; i>=2; i--){
                fact = fact * i;
            }
            System.out.println("Factorial: " + fact);
        }
    }
}

public class th {
    public static void main(String [] args){
        System.out.println("Main thread started.");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        myThread mt1 = new myThread(num);
        Thread th1 = new Thread(mt1);
        th1.start();

        System.out.println("Main thread ended.");
    }
}