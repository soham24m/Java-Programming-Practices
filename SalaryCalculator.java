// Program Name: SalaryCalculator
// Description: Calculates total salary including bonus

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double basicSalary;
        double bonusPercentage;
        double bonusAmount;
        double totalSalary;

        System.out.print("Enter Basic Salary: ");
        basicSalary = input.nextDouble();

        System.out.print("Enter Bonus Percentage: ");
        bonusPercentage = input.nextDouble();

        bonusAmount = (basicSalary * bonusPercentage) / 100;
        totalSalary = basicSalary + bonusAmount;

        System.out.println("Bonus Amount: " + bonusAmount);
        System.out.println("Total Salary: " + totalSalary);

        input.close();
    }
}
