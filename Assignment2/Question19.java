import java.util.Scanner;

public class Question19 
{
    public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase Letter"
                     : (ch >= 'a' && ch <= 'z') ? "Lowercase Letter"
                     : "Not a Letter";

        System.out.println("The character '" + ch + "' is: " + result);
    }
}

