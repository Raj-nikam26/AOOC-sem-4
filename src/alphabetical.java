import java.util.Scanner;
public class alphabetical {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] names = new String[10];

            // Taking input from the user
            System.out.println("Enter 10 names:");
            for (int i = 0; i < 10; i++) {
                names[i] = scanner.nextLine();
            }


            for (int i = 0; i < 9; i++) { // Outer loop (passes)
                for (int j = 0; j < 9 - i; j++) { // Inner loop (comparisons)
                    if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                        // Swap if current name is greater than the ne
                        String temp = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = temp;
                    }
                }
            }

            // Displaying sorted names
            System.out.println("\nNames in Alphabetical Order:");
            for (String name : names) {
                System.out.println(name);
            }

            scanner.close();
        }


}
