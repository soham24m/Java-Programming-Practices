import java.util.Scanner;

public class GreetingProgram {

    public static void displayGreeting(String userName) {
        System.out.println("Hello, " + userName + "! Welcome to Java.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        displayGreeting(userName);

        input.close();
    }
}