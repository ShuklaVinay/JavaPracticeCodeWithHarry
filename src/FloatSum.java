//Create an array of 5 floats and calculate their sum.
public class FloatSum {
    public static void main(String[] args) {
        float[] num={22.5f,45.5f,60.56f,23.89f,50.55f};
       float sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum +=num[i];
        }
        System.out.println("sum of floating numbers="+sum);
    }
}
