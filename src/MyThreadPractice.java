//extends Thread class to create a thread

class MyThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<1000) {
            System.out.println("MyThread is use for cooking.");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
      int i=0;
        while (i<1000)
        {
            System.out.println("MyThread1 is use for Chatting with her");
            System.out.println("I am not happy!");
            i++;
        }
    }
}


public class MyThreadPractice {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread1 t2=new MyThread1();
        t1.start();
        t2.start();
    }
}
