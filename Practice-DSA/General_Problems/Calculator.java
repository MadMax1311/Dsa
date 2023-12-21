import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =0;
        while(true){
            System.out.print("Enter the operator: ");
            char opt = sc.next().charAt(0);
            if(opt =='+' || opt == '-' || opt =='*' || opt =='/' || opt =='%' ){
                System.out.print("Enter the numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(opt =='+'){
                num =num1+num2;
            }
            if(opt =='-'){
                num = num1-num2;
            }
            if(opt =='*'){
                num =num1*num2;
            }
            if(opt =='/'){
                if(num2 !=0){
                    num =num1/num2;
                }
            }
            if(opt =='%'){
                num = num1%num2;
            }
        }
            else if(opt =='x'|| opt=='X'){
                break;
            }
            else{
                System.out.println("invalid statement");
                }
                System.out.println(num);
            }
        }
 }
