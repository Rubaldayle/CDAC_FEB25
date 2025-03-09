//Write a Java program that takes two integers as input and performs all arithmetic
//operations on them.

import java.util.Scanner;

public class Question2 
{
    public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
    
        int addition = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int quotient = (num2 != 0) ? (num1 / num2) : 0; 
        int remainder = (num2 != 0) ? (num1 % num2) : 0;

        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + substraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + (num2 != 0 ? quotient : "Undefined (division by zero)"));
        System.out.println(num1 + " % " + num2 + " = " + (num2 != 0 ? remainder : "Undefined (modulo by zero)"));
    }
}

