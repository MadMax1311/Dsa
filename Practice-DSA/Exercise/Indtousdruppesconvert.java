// input currency in rupees and output in USD.
import java.util.Scanner;

public class Indtousdruppesconvert {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter amount in indian ruppes(R): ");
    double n =sc.nextDouble();
    double USD = n/82.20;
    System.out.println("The amount in USD is: "+USD);
    }
}
