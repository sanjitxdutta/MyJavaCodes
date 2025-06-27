import java.util.*;
class MyThread implements Runnable 
{
    String tName;
    int n;
    MyThread(String name, int n) 
    {
        tName= name;
        this.n= n;
    }

    public void run() 
    {
        System.out.println("Factorial Thread: Started");
        if (n<0)
        {
            System.out.println("Factorial Thread: ERROR");
        }
        else
        {
            long ans= 1;
            for(int i=2; i<=n; i++) 
            {
                ans=ans*i;
            }
            System.out.println("Factorial Thread:  "+ans);
        }
    }
}

public class TestRunnable
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        
        MyThread mt1=new MyThread("Factorial", n); 

        Thread nt1=new Thread(mt1); 
        nt1.start();

        System.out.println("Main Thread. Ended");
    }
}
