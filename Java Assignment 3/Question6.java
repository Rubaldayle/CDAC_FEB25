import java.util.Scanner;

class ElectricityBill{
String cus_name;
double unit;
double Bill_Ammount;

ElectricityBill(String cus_name, double unit){
this.cus_name = cus_name;
this.unit = unit;
}
 
 public double calculateBillAmount(){
 if (unit <= 100) {
           Bill_Ammount = unit * 5;
        } else if (unit <= 300)
			{
            Bill_Ammount = (100 * 5) + ((unit - 100) * 7);
        } else 
		{
            Bill_Ammount = (100 * 5) + (200 * 7) + ((unit - 300) * 10);
        }
		return Bill_Ammount;
    }
 }
class Question6{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your name:");
String cus_name = scanner.nextLine();

System.out.println("Enter units Consumed value:");
double unit = scanner.nextDouble();
scanner.close();

ElectricityBill e = new ElectricityBill(cus_name, unit);
System.out.println("Your Bill Ammount is:" + e.calculateBillAmount());

   }



}
