class  primeornot
 {
    public static boolean isPrime(int number)
 {
        if (number < 2) 
{
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++)
 {
            if (number % i == 0)
 {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args)
 {
        int number = 17;
        
        if (isPrime(number)) 
{
            System.out.println("The number is prime.");
        } 
else 
{
            System.out.println("The number is not prime.");
        }
    }
}
