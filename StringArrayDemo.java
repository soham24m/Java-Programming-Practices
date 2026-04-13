public class StringArrayDemo {

    public static void displayNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        String[] studentNames = {"Eric", "Soham", "Riya", "Aman"};

        displayNames(studentNames);
    }
}