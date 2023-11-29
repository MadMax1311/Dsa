import java.util.Scanner;
import java.util.Arrays;

public class SwapArrayndreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc .nextInt();
        int arr [] = new int[size];

        // input
        for (int i =0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        sawp(arr , 0,3);
        System.out.println(Arrays.toString(arr));
    }
    static void sawp(int arr[] , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
