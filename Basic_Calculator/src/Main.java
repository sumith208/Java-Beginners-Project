import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Number 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Number 2 : ");
            int num2 = sc.nextInt();
            System.out.print("Operator : ");
            String op = sc.next();

            switch (op) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                case "%":
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
        }
    }
}