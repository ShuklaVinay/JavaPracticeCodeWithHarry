//to find max & min value in array

import java.util.Scanner;
public class ArrayMaxMinElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] num=new int[size];
        System.out.println("enter array element:");
        for(int i=0;i<size;i++) {
            num[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(min);
        //System.out.println("max element in array is:");
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>max)
            {
                max=num[i];
            }
            if(num[i]<min)
            {
                min=num[i];
            }

           // System.out.println(num[i]);
        }
        System.out.println("Maximum value in array="+max);
        System.out.println("Minimum value in array="+min);
    }
}
