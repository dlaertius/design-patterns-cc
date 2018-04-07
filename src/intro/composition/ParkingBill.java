package intro.composition;

public class ParkingBill {
	
	private ValueCalc calc;
	private Vehicle vehicle;
	private long end;
	private long begin;
	
	public ParkingBill (Vehicle vh, long begin) {
		this.vehicle = vh;
		this.begin = begin;
	}
	
	public double valueBill(long end) {			//get for bill.
		
		this.end = end;
		
		if (this.end - this.begin >= 1 && this.end - this.begin <= 24) {
			setCalcMethod(new HourCalc(Parking.hourValue));
		}else {
			setCalcMethod(new DailyCalc(Parking.dailyValue));
		}
		return calc.calcular((int) Math.ceil(end-begin), vehicle);
	}
	
	public void setCalcMethod (ValueCalc selectCalc) {
		this.calc = selectCalc;
	}

}
