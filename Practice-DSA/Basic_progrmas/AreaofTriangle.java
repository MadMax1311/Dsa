package Basic_progrmas;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        System.out.print("Enter the base of triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of trinagle: ");
        float h =sc.nextFloat();

        // int mul = 1/2;
        // float sum = mul*base*h;
        float mul = (base * h)/2;
        System.out.print("Area of trinagle: "+mul);
    }
}
