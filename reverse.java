import java.util.Scanner;

 class reverse
 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber);
    }
    
    public static int reverseNumber(int number) 
{
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }
}
