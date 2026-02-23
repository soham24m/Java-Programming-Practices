// Program Name: TemperatureConverter
// Description: Converts Celsius to Fahrenheit

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        double celsius;
        double fahrenheit;

        // Input
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Formula: F = (C * 9/5) + 32
        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        input.close();
    }
}