public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        boolean result = palindromeCheck(number);
        System.out.println(result);
    }
    public static boolean palindromeCheck(int x){
        
        int oldNumber = x;
        int newNumber = 0;
        while(x > 0){
            int digit = 0;
            digit = x % 10;
            newNumber = newNumber * 10 + digit;
            x /= 10;
        }
        return newNumber == oldNumber;
    }
}
