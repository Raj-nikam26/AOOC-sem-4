import java.util.Scanner;

public class transpose {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix1 = new int[2][2];
            int[][] matrix2 = new int[2][2];
            int[][] result = new int[2][2];

            System.out.println("Enter elements of first 2×2 matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements of second 2×2 matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose of first matrix");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Addition
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    System.out.println("Result of Matrix Addition:");
                    printMatrix(result);
                    break;

                case 2:
                    // Multiplication
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[i][j] = 0;
                            for (int k = 0; k < 2; k++) {
                                result[i][j] += matrix1[i][k] * matrix2[k][j];
                            }
                        }
                    }
                    System.out.println("Result of Matrix Multiplication:");
                    printMatrix(result);
                    break;

                case 3:
                    // Transpose
                    System.out.println("Transpose of First Matrix:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(matrix1[j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }

        }

        public static void printMatrix(int[][] matrix) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }


}

/*OUTPUT

Enter elements of first 2×2 matrix:
        1
        2
        3
        4
Enter elements of second 2×2 matrix:
        4
        5
        3
        2

Choose an operation:
        1. Addition
2. Multiplication
3. Transpose of first matrix
1
Result of Matrix Addition:
        5 7
        6 6

2
Result of Matrix Multiplication:
10 9
148 178

 result[i][j] += matrix1[i][k] * matrix2[k][j];

3
Transpose of First Matrix:
1 3
2 4

*/