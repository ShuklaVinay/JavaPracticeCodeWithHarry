//creating thread by using Runnable interface

class MyThreadRunnable implements Runnable
{
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("MyThreadRunnable is running!");
            i++;
        }
    }
}
class MyThreadRunnable1 implements Runnable
{
    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println("MyThreadRunnable1 is running!");
            i++;
        }
    }
}

public class MyThreadRunnablePr {
    public static void main(String[] args) {
        MyThreadRunnable r1=new MyThreadRunnable();
        Thread t1=new Thread(r1);
        MyThreadRunnable1 r2=new MyThreadRunnable1();
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
