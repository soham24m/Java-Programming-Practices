// Program Name: AverageSpeedCalculator
// Description: Calculates average speed using distance and time

import java.util.Scanner;

public class AverageSpeedCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalDistance;
        double totalTime;
        double averageSpeed;

        System.out.print("Enter total distance travelled: ");
        totalDistance = input.nextDouble();

        System.out.print("Enter total time taken (in hours): ");
        totalTime = input.nextDouble();

        averageSpeed = totalDistance / totalTime;

        System.out.println("Average Speed: " + averageSpeed);

        input.close();
    }
}
