public class VarArgs {

    public static int sum(int ...arr)
    {
        int result=0;
        for(int a:arr)
        {
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("nothing to sum="+sum(4));
        System.out.println("sum of two 10 and 20 no.="+ sum(10,20));
        System.out.println("sum ="+sum(2,3,4,5,6,7,56,34,78,56,2,3456,7787876));
    }
}
