 // Implement a Java program to find the absolute value of an integer using bitwise
//operators.
//Hint: mask = num >> 31; abs = (num + mask) ^ mask;

 import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
      
        int mask = num >> 31; 
        int absValue = (num + mask) ^ mask; 

        System.out.println("Absolute value: " + absValue);
    }
}

