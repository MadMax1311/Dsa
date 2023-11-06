import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistfor{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // input
        for(int i =0 ; i< 5; i++){
            list.add(sc.nextInt());
        }
        // output
        for(int i = 0; i< 5; i++){
            System.out.println(list.get(i));
        }
        
    }
}