import java.math.*;
 
class Tester {
     
    // Function to calculate sum of all proper
    // divisors num --> given natural number
    static int divSum(int num)
    {
        // Final result of summation of divisors
        int result = 0;
      
        // find all divisors which divides 'num'
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            // if 'i' is divisor of 'num'
            if (num % i == 0)
            {
                // if both divisors are same then 
                // add it only once else add both
                if (i == (num / i))
                    result += i;
                else
                    result += (i + num / i);
            }
        }
      
        // Add 1 to the result as 1 is also
        // a divisor
        return (result + 1);
    }
    // Driver program to run the case
    public static void main(String[] args)
    {
        int num = 48;
        System.out.println(divSum(num)+num);
    }
}
 