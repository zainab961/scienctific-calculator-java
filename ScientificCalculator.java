import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Scientific Calculator =====");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Power (x^y)");
        System.out.println("6. Square Root (√x)");
        System.out.println("7. Logarithm (log10)");
        System.out.println("8. Natural Logarithm (ln)");
        System.out.println("9. Sine (sin)");
        System.out.println("10. Cosine (cos)");
        System.out.println("11. Tangent (tan)");

        System.out.print("Enter your choice (1-11): ");
        int choice = scanner.nextInt();

        double num1, num2, result;

        switch (choice) {
            case 1: // Addition
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2: // Subtraction
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3: // Multiplication
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4: // Division
                System.out.print("Enter numerator: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter denominator: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            case 5: // Power
                System.out.print("Enter base: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                num2 = scanner.nextDouble();
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;

            case 6: // Square Root
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Negative number for square root!");
                }
                break;

            case 7: // Logarithm base 10
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                if (num1 > 0) {
                    result = Math.log10(num1);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Logarithm undefined for non-positive numbers!");
                }
                break;

            case 8: // Natural log
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                if (num1 > 0) {
                    result = Math.log(num1);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Logarithm undefined for non-positive numbers!");
                }
                break;

            case 9: // Sine
                System.out.print("Enter angle in degrees: ");
                num1 = scanner.nextDouble();
                result = Math.sin(Math.toRadians(num1));
                System.out.println("Result: " + result);
                break;

            case 10: // Cosine
                System.out.print("Enter angle in degrees: ");
                num1 = scanner.nextDouble();
                result = Math.cos(Math.toRadians(num1));
                System.out.println("Result: " + result);
                break;

            case 11: // Tangent
                System.out.print("Enter angle in degrees: ");
                num1 = scanner.nextDouble();
                result = Math.tan(Math.toRadians(num1));
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
