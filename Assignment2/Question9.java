
 //Implement a Java program that checks if a number is within a specific range (20 to
//50) without using if-else.
//Hint: Use logical AND (&&) in a print statement.import java.util.Scanner;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("number is within a specific range (20 to 50): " + (num >= 20 && num <= 50));
    }
}

