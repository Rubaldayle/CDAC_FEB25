import java.util.Scanner;

public class Question18 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's percentage: ");
        double percentage = scanner.nextDouble();
        scanner.close();

        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}
