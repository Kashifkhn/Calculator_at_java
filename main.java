import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // calcluator using switch
        System.out.println("Enter any Operator + - * / % ");
        char op = sc.next().charAt(0);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        switch (op) {
            case '+':
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
                break;
            case '-':
                int sub = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + sub);
                break;
            case '*':
                int mul = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + mul);
                break;
            case '/':
                int divi = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + divi);
                break;
            case '%':
                int modu = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + modu);
                break;

            default:
            System.out.println("Error !! Wrong Operator ");
                break;
        }

    }
}