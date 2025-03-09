import java.util.Scanner;

public class Question16 
{
    public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

     String result = (num > 0) ? "Positive"
                     : (num < 0) ? "Negative"
                     : "Zero";

        System.out.println("The number is: " + result);
    }
}

