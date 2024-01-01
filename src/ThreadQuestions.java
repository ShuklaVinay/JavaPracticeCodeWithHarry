//to print Good Morning & Welcome continuously on the screen by using Thread

class MyThr1 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while (i<100)
        {
            System.out.println("Good Morning!");

            i++;
        }
    }
}
class MyThr2 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while (i<100)
        {
           try {
                Thread.sleep(100);
            }
            catch (Exception e)

            {
                System.out.println(e);
            }

            System.out.println("Welcome");
            i++;
        }
    }
}

public class ThreadQuestions {
    public static void main(String[] args) {
       MyThr1 t1=new MyThr1();
       MyThr2 t2=new MyThr2();
       t1.setPriority(6);
       t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
       t1.start();
       t2.start();
    }
}
