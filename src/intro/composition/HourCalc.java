package intro.composition;

public class HourCalc implements ValueCalc {
	
	private double hourValue;
	
	public HourCalc(double value) {
		this.hourValue = value;
	}

	@Override
	public double calcular(int time, Vehicle vh) {
		if (vh.getType().equals("Common")) {
			return (Parking.commonVHFees * this.hourValue) + (this.hourValue * time); 
		}else {
			return (Parking.superVHFees * this.hourValue) + (this.hourValue * time);
		}
	}
}