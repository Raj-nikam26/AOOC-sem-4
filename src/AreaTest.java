import java.util.Scanner;

public class AreaTest {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = scanner.nextDouble();

            Area rectangle = new Area();
            rectangle.setDim(length, breadth);

            System.out.println("The area of the rectangle is: " + rectangle.getArea());

        }

}
