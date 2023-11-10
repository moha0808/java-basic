 class paildrome
 {
    public static boolean isPalindrome(int number)
 {
        String str = String.valueOf(number);
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
 {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args)
 {
        int number = 11011;
        
        if (isPalindrome(number)) 
{
            System.out.println(number+" the number is a palindrome.");
        } 
else 
{
            System.out.println(number+" The number is not a palindrome.");
        }
    }
}
