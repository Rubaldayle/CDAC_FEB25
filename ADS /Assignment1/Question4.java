
class Question4 {

    // 1. Check if a number is prime using recursion
    public static boolean isPrime(int num, int divisor) {
        if (num <= 1) 
          return false;  // 0 and 1 are not prime
        if (divisor == 1)
          return true; // Base case: checked all divisors
        if (num % divisor == 0) 
          return false; // If divisible, not prime
        return isPrime(num, divisor - 1); // Check next divisor
    }

    public static boolean isPrime(int num) {
        return isPrime(num, num / 2);
    }

    // 2. Check whether a given string is a palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right)
          return true; // Base case: all matched
        if (str.charAt(left) != str.charAt(right)) 
          return false; // Mismatch
        return isPalindrome(str, left + 1, right - 1); // Check next pair
    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    // 3. Find the sum of digits of a given number
    public static int sumOfDigits(int num) {
        if (num == 0) 
          return 0; // Base case: no digits left
        return (num % 10) + sumOfDigits(num / 10); // Add last digit and recurse
    }

    // 4. Calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) 
      return 0; // Base case: Fib(0) = 0
        if (n == 1) 
          return 1; // Base case: Fib(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recurrence relation
    }

    // 5. Calculate a raised to the power b
    public static int power(int a, int b) {
        if (b == 0) return 1; // Base case: anything^0 = 1
        return a * power(a, b - 1); // Multiply a recursively
    }

    public static void main(String[] args) {
        // Test cases
        int num = 7;
        String str = "racecar";
        int numForSum = 1234;
        int fibIndex = 6;
        int a = 2, b = 5;

        System.out.println("Is prime: " + isPrime(num));
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str));
        System.out.println("Sum of digits of " + numForSum + ": " + sumOfDigits(numForSum));
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex));
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}
