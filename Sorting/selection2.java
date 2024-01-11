import java.util.Arrays;

public class selection2{
    public static void main(String[] args) {
        int [] num = {5,4,3,2,1};
        select(num);
        System.out.println(Arrays.toString(num));
        
    }
    static void select(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;
            int max = max(arr, 0, last);
            swap(arr, max, last);
        }
    }
    static int max(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int fis, int sec){
        int temp = arr[fis];
        arr[fis] = arr[sec];
        arr[sec] = temp;
    }
}