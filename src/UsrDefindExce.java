class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
public class UsrDefindExce {
    public static void vote(int age)throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Not eligible for voting!");
        }
        else {
            System.out.println("eligible for voting!");
        }
    }

    public static void main(String[] args) {
        try {
            vote(17);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
