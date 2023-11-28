import java.util.Scanner;
import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = new String[4];

        for(int i =0; i < str.length; i++){
            str[i] = sc.next();
        }
        // modify
        str[2] = "shyam";// it means we fixed the 2 index's element to shyam
        System.out.println(Arrays.toString(str));// its used to print an array like [. . . .]this . is element
    }
}
