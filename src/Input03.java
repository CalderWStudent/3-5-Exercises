import java.util.Scanner;

class Input03 {
    public static void main(String[] args) {
        // Create a Scanner to receive user input from the console.
        Scanner scanner = new Scanner(System.in);

        // Find three integers entered by the user, then print the sum of them.
        System.out.println("Enter three numbers to get the sum:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Sum of entered numbers: " + (num1 + num2 + num3));

        // Close the Scanner.
        scanner.close();
    }
}