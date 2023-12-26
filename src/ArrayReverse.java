//Write a Java program to reverse an array.

import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter teh value  in array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array before reverse:");
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        //for reverse an array
       int len=arr.length;
        int n=Math.floorDiv(len,2);
        int temp;
        for(int i=0;i<n;i++)
        {
            temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        System.out.println("Array after Reverse:");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
