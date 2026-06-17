import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, reversed = 0;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while(number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number = number /10; // Remove the last digit
        }
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}