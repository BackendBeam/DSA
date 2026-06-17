import java.util.Scanner;
public class SwapTwoNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a temporary variable
        // int temp = a;
        // a = b;
        // b = temp;

        // Swapping without using a temporary variable
        a = a + b; // 5 + 10
        b = a - b; // 15 - 10
        a = a - b; // 15 - 5
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}