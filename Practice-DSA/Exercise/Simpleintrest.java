//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount(P): ");
    float Principle = sc.nextFloat();
        System.out.print("Enter the Time periods in year(T): ");
    float Time = sc.nextFloat();
        System.out.print("Enter the Rate(%) (R): ");
    float n= sc.nextFloat();
    float Rate = (n/100);

    float Interest = Principle * (1 + Rate * Time);
        System.out.println(Interest);
    }
}
