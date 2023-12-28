//Game rock paper & scissor

import java.util.Random;
import java.util.Scanner;

public class GameRockPaperScissor {
    public static void main(String[] args) {

      //  System.out.println("Enter string");
        //Scanner sc1 = new Scanner(System.in);
       // String str = sc1.next();
        //char a1 =str.charAt(0);
        //System.out.println(a1);

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int input;
        int limit = 3;

        do {
            System.out.println("Please enter 0 for Rock , 1 for Paper and 2 for Scissor :");
            int userInput = sc.nextInt();
            int computerInput = rm.nextInt(limit);
            if (userInput == 0 && computerInput == 2 || userInput == 1 & computerInput == 0 || userInput == 2 && computerInput == 1) {
                System.out.println("You win!");
            } else if (userInput == computerInput) {
                System.out.println("Game draw!");
            } else {
                System.out.println("Computer win!");
            }
            // System.out.println("Computer Choice:" + computerInput);
            if (computerInput == 0) {
                System.out.println("Computer choice :" + " " + computerInput + " ->" + " Rock");

            } else if (computerInput == 1) {
                System.out.println("Computer choice :" + " " + computerInput + " ->" + " Paper");
            } else {
                System.out.println("Computer choice :" + " " + computerInput + " ->" + " Scissor");
            }

            System.out.println("Continue in game ? (Yes(3) or No(4))");
         input = sc.nextInt();
            //String str = sc.next();
         // char  a2= str.charAt(0);
          //char compareChar ='y';
        } while(input==3);
    }
}
