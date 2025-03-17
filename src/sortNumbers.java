import java.util.Arrays;

public class sortNumbers {
    public static void main(String[] args) {
        // Given list of 10 numbers
        int[] numbers = {45, 12, 89, 33, 77, 5, 98, 20, 56, 39};

        // Sorting the array in ascending order
        Arrays.sort(numbers);

        // Displaying the sorted numbers
        System.out.println("Sorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}