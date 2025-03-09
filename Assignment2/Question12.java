//Write a Java program to multiply a number by 8 without using * or / operators.
//Hint: Use bitwise left shift (<<).

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
    
        int result = num << 3; 
        System.out.println("Result after multiplying by 8: " + result);
    }
}

