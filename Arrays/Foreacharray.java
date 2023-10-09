import java.util.Scanner;
import java.util.Arrays;

public class Foreacharray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an arrys: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));// Arrays.toString() is used to print an actual arrys , it is used to print the array

        
        // for (int i =0; i< arr.length; i++) {
            //     System.out.print(arr[i] +" ");
            // }
            // for(int num : arr){
                //     System.out.print(num+" ");
            // }
    }
            
 }
