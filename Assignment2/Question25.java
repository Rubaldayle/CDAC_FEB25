
import java.util.Scanner;

public class Question25
 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int rev = 0;
    
        while (num != 0) 
        {
            rev = rev * 10 + num % 10; 
            num /= 10; 
        }
        System.out.println("Reversed number: " + rev);
    }
}

