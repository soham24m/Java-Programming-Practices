import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderDemo {

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileInput = new Scanner(file);

            while (fileInput.hasNextLine()) {
                System.out.println(fileInput.nextLine());
            }

            fileInput.close();

        } catch (FileNotFoundException exception) {
            System.out.println("Error: File not found.");
        }
    }

    public static void main(String[] args) {
        String fileName = "sample.txt";
        readFile(fileName);
    }
}