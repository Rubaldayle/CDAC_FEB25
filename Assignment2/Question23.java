import java.util.Scanner;

public class Question23
  {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
      
        String result = (num & 1) == 0 ? "Even" : "Odd";

        System.out.println("The number is: " + result);
    }
}

