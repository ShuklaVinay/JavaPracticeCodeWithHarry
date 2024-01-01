public class ExceptionPropagation {
    public static void m1(){

            m2();

    }
    public static void m2()
    {
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        try {
            m1();
        }
        catch (Exception e)
        {
            System.out.println("Exception handled by main method");
        }

    }
}
