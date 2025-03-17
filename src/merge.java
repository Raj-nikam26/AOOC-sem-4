import java.util.Arrays;
import java.util.Scanner;

public class merge {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input size of first array
            System.out.print("Enter the size of first sorted array: ");
            int n1 = scanner.nextInt();
            int[] arr1 = new int[n1];

            // Input elements of first sorted array
            System.out.println("Enter " + n1 + " sorted elements for first array:");
            for (int i = 0; i < n1; i++) {
                arr1[i] = scanner.nextInt();
            }

            // Input size of second array
            System.out.print("Enter the size of second sorted array: ");
            int n2 = scanner.nextInt();
            int[] arr2 = new int[n2];

            // Input elements of second sorted array
            System.out.println("Enter " + n2 + " sorted elements for second array:");
            for (int i = 0; i < n2; i++) {
                arr2[i] = scanner.nextInt();
            }

            int a=arr1.length;
            int b=arr2.length;

            int c=a + b;
            int[] arr3=new int[c];

            for (int i = 0; i < a; i++) {
                arr3[i]=arr1[i];
            }

            for (int i = 0; i < b; i++) {
                arr3[a+i]=arr2[i];
            }
            System.out.println(""+ Arrays.toString(arr3));

            for(int i=0; i<arr3.length-1; i++){
                for(int j=0; j<arr3.length-1; j++){
                    if(arr3[j]>arr3[j+1]){
                        //swap
                        int temp=arr3[j];
                        arr3[j]=arr3[j+1];
                        arr3[j+1]=temp;
                    }
                }
            }
            printArr(arr3);
        }
    public static void printArr(int arr3[])
    {

            System.out.println(""+ Arrays.toString(arr3));

    }

}

/*
OUTPUT:
Enter the size of first sorted array: 3
Enter 3 sorted elements for first array:
43
23
88
Enter the size of second sorted array: 3
Enter 3 sorted elements for second array:
56
999
65
[43, 23, 88, 56, 999, 65]
[23, 43, 56, 65, 88, 999]
 */



