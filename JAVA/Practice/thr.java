import java.util.*;

class mythread1 implements Runnable{
    String tName;
    int [] arr;
    int sum = 0;
    mythread1(String tName, int [] arr){
        this.tName = tName;
        this.arr = arr;
    }

    public int getSum(){
        return sum;
    }

    public void run(){
        for(int item: arr){
            sum += item;
        }
    }
}

public class thr {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int i=0;

        while(sc.hasNextInt()){
            arr[i++] = sc.nextInt();
        }

        mythread1 mt1 = new mythread1("TH1", arr);
        mythread1 mt2 = new mythread1("TH2", arr);

        Thread th1 = new Thread(mt1);
        Thread th2 = new Thread(mt2);

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch(Exception e){
            System.out.println("Main thread interrupted.");
        }

        System.out.println(mt1.tName + ":" + mt1.getSum());
        System.out.println(mt2.tName + ":" + mt2.getSum());
    }
}
