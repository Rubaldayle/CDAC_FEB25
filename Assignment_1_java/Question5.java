import java.util.Scanner;

public class Question5
  {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number a: ");
        int a = scanner.nextInt();
      
        System.out.print("Enter second number b: ");
        int b = scanner.nextInt();
        scanner.close();

                        System.out.println("\nBefore Swapping:");
                        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

                         System.out.println("\nAfter Swapping:");
                         System.out.println("a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

