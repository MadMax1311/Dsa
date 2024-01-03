// package Sorting;

import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] num = {5,4,4,3,2,2,2,1};
        num = sortArray(num);
        System.out.println(Arrays.toString(num));
    }
    static int[] sortArray(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(arr,0,mid)) ;
        int[] right = sortArray(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0; //for a first an array
        int j = 0; //for a second an array
        int k = 0; //Merge both array

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //It me be possible one of the arrays is not complete
        //copy the remaining element
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
