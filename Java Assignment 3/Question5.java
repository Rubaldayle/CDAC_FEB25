import java.util.Scanner;

class BMI {
double height;
double weight;

BMI(double height, double weight)
{
this.height = height;
this.weight = weight;
     }
 public double getheight(){
 return height;
 }
public double getweight(){
 return weight;
 }
 public void setheight(double height){
	 this.height = height;
      }
	  
 public void setweight(double weight){
	 this.weight = weight;
    }
	
 public double calculateBMI(){
 return weight/(height*height);
 }

 }
class Question5{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your height:");
	double height = scanner.nextDouble();
	
	System.out.println("Enter your weight:");
	double weight = scanner.nextDouble();
	
    BMI b = new BMI(height, weight);

System.out.println("BMI = " + b.calculateBMI());
         }
   }


