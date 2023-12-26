//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
public class AvgMarks {
    public static void main(String[] args) {
        float[] marks={55.5f,60.5f,44.5f,87.5f,65.5f};
        float sum=0;
        for (float f:marks)
        {
            sum +=f;
        }
        System.out.println("Average marks="+sum/marks.length);
    }
}
