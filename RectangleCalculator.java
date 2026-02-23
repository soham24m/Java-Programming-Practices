 // Program Name: RectangleCalculator
// Description: Calculates Area and Perimeter of a Rectangle

import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declaring variables
        double length;
        double width;
        double area;
        double perimeter;

        // Taking user input
        System.out.print("Enter length of rectangle: ");
        length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        width = input.nextDouble();

        // Calculations
        area = length * width;
        perimeter = 2 * (length + width);

        // Output
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        input.close();
    }
} 

