//Write a program to find out whether a given integer is present in an array or not.
public class ArrayPresent {
    public static void main(String[] args) {
        int[] num={23,45,67,89,11,25};
        int x=67;
        boolean isInArray=false;
        for(int i:num)
        {
            if (x == i) {
                isInArray = true;
             break;
            }

        }
        if(isInArray)
        {
            System.out.println("no is present in array");
        }
        else {
            System.out.println("no is not present in array");
        }
    }
}
