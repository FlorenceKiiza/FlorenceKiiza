package Bills;
import java.util.*;


public class ElectricityBilling {
	public static void main(String [] args) {
		long units;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of units: ");
		units = sc.nextLong();
		
		double billPay = 0;
		
		if(units<100) {
			billPay = units*1.50;
			
		}else if(units<300) {
			billPay = units*1.50 + (units-100)*2;
		}else if(units>300) {
			billPay = 100*1.50 + 200 * 2+(units-300)*3;
			
		}else {
			System.out.println("Invalid entry");
		}
		
		System.out.println("You pay " + billPay + " Ugshs");
		
	}
}
