// Program Name: DistanceCalculator
// Description: Calculates total travel distance

import java.util.Scanner;

public class DistanceCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceFromToVia;
        double distanceViaToFinalCity;
        double totalDistance;

        System.out.print("Enter distance from Start to Via city: ");
        distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from Via city to Final city: ");
        distanceViaToFinalCity = input.nextDouble();

        totalDistance = distanceFromToVia + distanceViaToFinalCity;

        System.out.println("Total Distance Travelled: " + totalDistance);

        input.close();
    }
}
