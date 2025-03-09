public class Question3 
{
    public static void main(String[] args)
  {
        // Implicit Type Casting (Widening) 
        int intVal = 100;
        double doubleVal = intVal; 

                  System.out.println("Integer value: " + intVal);
                  System.out.println("Converted to Double: " + doubleVal);

        // Explicit Type Casting (Narrowing)
        double originalDouble = 99.99;
        int castedInt = (int) originalDouble; 
        
                   System.out.println("Double value: " + originalDouble);
                    System.out.println("Converted to Integer: " + castedInt);

        
        long longVal = 123456789L;
        short shortVal = (short) longVal; 

         
                      System.out.println("Long value: " + longVal);
                      System.out.println("Converted to Short: " + shortVal);
    }
}

