import java.util.Scanner;

public class Question22 
{
    public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
                default:
                System.out.println("Invalid operator! Please use +, -, *.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
