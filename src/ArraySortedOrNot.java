//Write a Java program to find whether an array is sorted or not.
public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] num={12,45,2,8,30,25};
        boolean isSorted=true;
        for(int i=1;i<num.length-1;i++)
        {
            if(num[i]>num[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
