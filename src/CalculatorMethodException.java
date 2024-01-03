class CannotDivideByZeroException extends Exception
{
    CannotDivideByZeroException(String msg)
    {
        System.out.println("The value of b is zero not divisible");
    }
}
class CanNotAddValueException extends Exception
{
    CanNotAddValueException(String msg)
    {
        System.out.println("value of a & b not added");
    }
}
class MaxInputException extends Exception
{
    @Override
    public String toString() {
        return "Maximum input";
    }

    @Override
    public String getMessage() {
        return "get() message";
    }
}
public class CalculatorMethodException {
   // double a,b;
    public double add(double a,double b)throws CanNotAddValueException
    {
        if(a==8 || b==9)
        {
            throw new CanNotAddValueException("value of a & b not added");
        }
        return a+b;
    }
    public double substract(double a,double b)throws MaxInputException
    {
        if(a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        return a-b;
    }
    public double multilpy(double a,double b)throws MaxInputException
    {
        if(a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        return a*b;
    }
    public double divide(double a,double b)throws CannotDivideByZeroException
    {
        if(b==0)
        {
            throw new CannotDivideByZeroException("value of b is zero");
        }
        return a/b;
    }
    public double module(double a,double b)throws CannotDivideByZeroException
    {
        if(b==0)
        {
            throw new CannotDivideByZeroException("value of b is zero");
        }
        return a%b;
    }

}
