public class MultipleCatch {
    public static void main(String[] args) {
        int a=10;
        int b=2,c;
        try {
            System.out.println(c = a / b);
            String str = "null";
            System.out.println(str.toUpperCase());
            String str1 = "1234566";
            String str2="shukla";
            int i = Integer.parseInt(str1);
            System.out.println(i);
            int[] arr = {12, 34, 12, 45, 12};
            System.out.println(arr[4]);
            System.out.println(str2.charAt(6));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException n)
        {
            System.out.println(n);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("End of main method.");

    }
}
