import java.util.Scanner;

public class Question8  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter first boolean value: ");
        boolean a = scanner.nextBoolean();
      
        System.out.print("Enter second boolean value: ");
        boolean b = scanner.nextBoolean();
      
        System.out.print("Enter third boolean value: ");
        boolean c = scanner.nextBoolean();
        scanner.close();

        boolean result = (a && b) || (a && c) || (b && c);

        System.out.println("At least two values are true: " + result);
    }
}

