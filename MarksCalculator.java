// Program Name: MarksCalculator
// Description: Calculates Total and Percentage of 3 subjects

import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        double subject1;
        double subject2;
        double subject3;
        double totalMarks;
        double percentage;
        double maximumMarksPerSubject = 100;
        double totalMaximumMarks;

        // Input
        System.out.print("Enter marks of Subject 1: ");
        subject1 = input.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        subject2 = input.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        subject3 = input.nextDouble();

        // Calculations
        totalMarks = subject1 + subject2 + subject3;
        totalMaximumMarks = maximumMarksPerSubject * 3;
        percentage = (totalMarks / totalMaximumMarks) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        input.close();
    }
}