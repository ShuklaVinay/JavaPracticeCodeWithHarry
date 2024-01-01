public class ThrowTestThrows {
    public void div(int a,int b)throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else {
            int c=a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args){
        ThrowTestThrows tt=new ThrowTestThrows();
        try {
            tt.div(10, 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("value of b is o");
        }
    }
}
