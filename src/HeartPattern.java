import java.util.Scanner;

//Heart Pattern
public class HeartPattern {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n(no. of rows)");
        n=sc.nextInt();
        for( i=n/2;i<=n;i+=2) {
            for ( j = 1; j <= n - i; j+=2) {
                System.out.print(" ");
            }
            for (j = 1; j<= i; j++) {
                System.out.print("*");
            }
           for(j=1;j<=n-i;j++)
           {
               System.out.print(" ");
           }
           for (j=1;j<=i;j++)
           {
               System.out.print("*");
           }
            System.out.println();
        }
        for ( i=n;i>=1;i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
