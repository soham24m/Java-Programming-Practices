// Program Name: SimpleInterestCalculator
// Description: Calculates Simple Interest

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring variables
        double principal;
        double rate;
        double time;
        double simpleInterest;

        // User input
        System.out.print("Enter Principal Amount: ");
        principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = input.nextDouble();

        // Formula: SI = (P * R * T) / 100
        simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        input.close();
    }
}
