public class GFG{
	
	public static void main (String [] args) {
		char test = 'a';
		int result;
		result = test + 2;
		System.out.println(result);
}
}


/*import java.io.*; 
 
class GFG {
 
    // Function to calculate sum of all 
    //divisors of a given number
    static int divSum(int n)
    {
        // Final result of summation 
        // of divisors
        int result = 0;
     
        // find all divisors which divides 'num'
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            // if 'i' is divisor of 'n'
            if (n % i == 0)
            {
                // if both divisors are same
                // then add it once else add
                // both
                if (i == (n / i))
                    result += i;
                else
                    result += (i + n / i);
            }
        }
     
        // Add 1 and n to result as above loop
        // considers proper divisors greater
        // than 1.
        return (result + n + 1);
         
    }
     
    // Driver program to run the case
    public static void main(String[] args)
    {
        int n = 17;
        System.out.println(divSum(n));
    }
}*/