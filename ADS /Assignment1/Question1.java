import java.util.Arrays;

public class Question1{
static int secondlar(int[] arr){
	if (arr.length < 2)        // If there are less than 2 elements
          return -1;    

int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for(int num : arr){
	if(num > first){
	second = first;
	first = num;
	}
else if(num > second && num != first){
	second = num;
    }
}
return(second == Integer.MIN_VALUE) ? -1:second;
   }
   
public static void movingzero(int[] arr){
	int nonzero = 0;
	
	for(int i = 0; i < arr.length; i++){
	  if(arr[i] != 0){
		  int temp = arr[i];
		  arr[i] = arr[nonzero];
		  arr[nonzero] = temp;
		  nonzero++;
	     }
	  }
}
	
       public static void main(String[] args){
	   int[] arr = {10, 0, 5, 20, 0, 8, 15};
	   
	   System.out.println("Second largest element: " +secondlar(arr));
	   
	   movingzero(arr);
	   System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
   }
}

