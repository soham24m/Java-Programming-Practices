import java.util.Scanner;

public class AsciiCodeFinder {

    public static void showAscii(char characterValue) {
        int asciiCode = (int) characterValue;
        System.out.println("ASCII Code of " + characterValue + " is: " + asciiCode);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char characterValue = input.next().charAt(0);

        showAscii(characterValue);

        input.close();
    }
}