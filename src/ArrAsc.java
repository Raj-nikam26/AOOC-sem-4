import java.util.*;

public class ArrAsc {

        public static void main(String[] args) {
            int arr[]={7,8,3,1,2,1,11,9};
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-1; j++){
                    if(arr[j]>arr[j+1]){
                        //swap
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            printArr(arr);
        }

        public static void printArr(int arr[])
        {
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

}


//OUTPUT

//1 2 3 7 8