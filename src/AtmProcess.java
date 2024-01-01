import java.util.Scanner;
public class AtmProcess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op;
        System.out.println("1- Welcome Screen\n2-Enter Pin\n3-Balance Inquiry\n4-Cash withdrawal\n5-Cash Deposit\n6-Exit");
       do {
           System.out.println("Please choose any no. to perform action");
           int pressKey = sc.nextInt();
           switch (pressKey) {
               case 1: {
                   System.out.println("Welcome to SBI bank");
                   break;
               }
               case 2: {
                   System.out.println("Please enter your pin");
                   break;
               }
               case 3: {
                   System.out.println("balance=10000");
                   break;
               }
               case 4: {
                   System.out.println("Cash Withdraw");
                   break;
               }
               case 5: {
                   System.out.println("Cash deposit");
                   break;
               }
               case 6:

                   System.exit(0);
               default:
                   System.out.println("Invalid key!");

           }
           System.out.println("for continue ? (Yes(7) or Exit(6)");
           op = sc.nextInt();
       }while(op==7);
    }
}
