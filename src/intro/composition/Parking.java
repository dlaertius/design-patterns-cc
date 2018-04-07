package intro.composition;

import com.sun.org.glassfish.gmbal.Description;

@Description("Design Patterns com Java: Projeto orientado a objetos guiado por padrões Book, pg: 31-36.")
public class Parking {

	public static double dailyValue = 60.0;
	public static double hourValue 	= 4.0;
	
	public static double commonVHFees 	= 0.4;
	public static double superVHFees 	= 0.6;
	
	public static void main(String[] args) {
		
		int enter = 14;
		int leave = 20;
		
		Vehicle vh = new Vehicle("Fusion", "Common");
		
		ParkingBill p1 = new ParkingBill(vh, enter);
		
		System.out.println("Vehicle type: " + vh.getType());
		System.out.println("Enter hour: " + enter + " Leave: " + leave);
		System.out.println("Value per hour: " + hourValue + " Value per day: " + dailyValue);
		System.out.println("Total to pay: " + p1.valueBill(leave));

	}
}
