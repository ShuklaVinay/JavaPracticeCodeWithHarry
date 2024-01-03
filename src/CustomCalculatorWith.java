public class CustomCalculatorWith
{
    public static void main(String[] args) throws CannotDivideByZeroException,CanNotAddValueException,MaxInputException
    {
        CalculatorMethodException cme=new CalculatorMethodException();
       //System.out.println(cme.divide(12,0));
        //System.out.println(cme.add(8,9));
        //cme.substract(1112233,2345678);
        //System.out.println(cme.module(122,0));
        System.out.println(cme.multilpy(1232123,123454));

      /*  You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000 */

    }
}
