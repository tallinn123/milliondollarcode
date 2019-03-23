package lesson3.numbers.expressions.math;  // 100 random dice rolls

public class RollingDice
{
    public static void main(String[] args)
    {
        int roll;
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i=0; i<100; i++)       // executed 100 times
        {
            roll = randomInt(1, 6); // This statement calls the randomInt method, specifying 1 and 6
                                            //as the range for the random integer to generate. The resulting
                                            //random number is assigned to the roll variable.
            System.out.print(roll + " ");
        }
        System.out.println();
    }
    public static int randomInt(int low, int high) //randomInt method indicates that the method returns an int
                                                    // value and accepts two int arguments: one named low and the other named high.
    {
        int result = (int)(Math.random()            // This expression converts the random double value to an integer
            * (high - low + 1)) + low;              //...between low and high.
        return result;      // return statement sends the random number back to the statement that called the randomInt method.
    }
}
