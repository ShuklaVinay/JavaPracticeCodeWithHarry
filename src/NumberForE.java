public class NumberForE {
    public static void main(String[] args) {
        String str="vinay";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch (NumberFormatException n)
        {
            System.out.println("string"+str+" "+"can not be changed in interger");
        }
        System.out.println("end of main");
    }
}
