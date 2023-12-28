//GuessNumber Game
import java.util.Scanner;
import java.util.Random;
class Game{
    int number;
    int noOfGuesses=0;
    int userInput;

    Game(){
        Random rm=new Random();
        number=rm.nextInt(100);
    }
    public int getNoOfGuesses(int noOfGuesses)
    {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses)
    {
        this.noOfGuesses=noOfGuesses;
    }
    void takeUserInput(){
        System.out.println("Guess the number!");
        Scanner sc=new Scanner(System.in);
        userInput=sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(userInput==number)
        {
            System.out.println("Yes guessed it right number:"+" "+number+"\n"+"you guessed it attempt"+" "+noOfGuesses);
            return true;
        } else if (userInput<number) {
            System.out.println("Number is too low...");
        } else if (userInput>number) {
            System.out.println("Number is too high....");
        }

            return false;
    }
}

public class MyGameGuessNumber {
    public static void main(String[] args) {
        Game gm = new Game();
        boolean b =false;
        while (!b)
        {
            gm.takeUserInput();
        b = gm.isCorrectNumber();
        //System.out.println(b);
    }
    }
}
