public class Divisor {

    public int divideTwoIntegerNumbers(int number1, int number2)
    {
        if(number2 ==0)
        {
            throw new IllegalArgumentException("Divisor can't be 0");
        }
        return number1/number2;
    }
}
