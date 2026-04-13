import java.util.Scanner;

public class StringMethodsDemo {

    public static void analyzeString(String text) {
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("First Character: " + text.charAt(0));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        analyzeString(text);

        input.close();
    }
}