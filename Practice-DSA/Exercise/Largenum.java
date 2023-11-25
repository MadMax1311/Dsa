// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the number2: ");
        float num2 = sc.nextFloat();

        if(num1 > num2)
        System.out.println("The greter number is number1: "+num1);
        else if(num2>num1)
        System.out.println("The greter number is number2: "+num2);
        else if(num1 == num2)
        System.out.println("Both number is same");
    }
    
}
