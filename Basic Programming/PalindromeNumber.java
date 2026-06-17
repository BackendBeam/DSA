import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else if (x == 0){
            return true;
        }
        int number = x;
        int reversedNumber=  0;
       
        while (number != 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        if(x == reversedNumber){
            return true;
        }
        return false;
    }
}