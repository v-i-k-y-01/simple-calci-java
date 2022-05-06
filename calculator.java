import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double a,b,result;
        char operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("choose your operator: /, +,-,%,*");
        operator=sc.next().charAt(0);

        System.out.println("enter the first number:");
        a=sc.nextDouble();
        System.out.println("enter the second number:");
        b=sc.nextDouble();
        switch(operator) {
            case '+':
                result = a + b;
                System.out.println("THE SUM IS=" + " " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("THE PRODUCT IS=" + " " + result);
                break;
            case '/':
                result = a / b;
                System.out.println("THE QUOTIENT IS=" + " " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("THE PRODUCT IS=" + " " + result);
                break;
            case '%':
                result = a % b;
                System.out.println("THE MODULUS IS=" + " " + result);
                break;
            default:
                System.out.println("INVALID OPERATOR");
                break;
        }
        }

    }

