public class TryCatchThrows {
    public void Wait()throws InterruptedException
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        TryCatchThrows tc=new TryCatchThrows();
        try {
            tc.Wait();
            System.out.println(10 / 0);
        }
        catch (Exception e)
        {
            System.out.println("exception handled");
        }
        System.out.println("end of main method");
    }

}
