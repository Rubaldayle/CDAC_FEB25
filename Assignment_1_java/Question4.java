import java.util.Scanner;

public class Question4
  {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        Double doubleValue = Double.valueOf(intValue);

                            System.out.println("Converted to Double: " + doubleValue);

        scanner.close();
    }
}

