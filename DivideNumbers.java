import java.util.Scanner;

public class DivideNumbers {

    public static void divideValues(int firstNumber, int secondNumber) {
        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        divideValues(firstNumber, secondNumber);

        input.close();
    }
}