//Implement a Java program that finds the minimum of four numbers using nested
//ternary operators

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
      
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
      
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
      
        System.out.print("Enter fourth number: ");
        int d = scanner.nextInt();
        scanner.close();

        int min = (a < b) 
                    ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d)) : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        System.out.println("The minimum number is: " + min);
    }
}

