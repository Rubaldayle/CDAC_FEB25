public class Question24 
{
    public static void main(String[] args) 
  {
        System.out.println("Even numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++)
          {
            if ((i & 1) == 0) 
            {
                System.out.print(i + " ");
            }
        }
    }
}

