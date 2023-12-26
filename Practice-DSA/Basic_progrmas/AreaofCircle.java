package Basic_progrmas;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();

        double sum = PI*(radius*radius);
        System.out.print("The area of circle is: "+ sum);
    }
    
}
