package intro.composition;

public class DailyCalc implements ValueCalc {
	
	private double dailyValue;
	
	public DailyCalc(double value) {
		this.dailyValue = value;
	}

	@Override
	public double calcular(int time, Vehicle vh) {			// Time in this case is days.
		if (vh.getName().equals("Common")) {
			return (this.dailyValue * Parking.commonVHFees) + (this.dailyValue * time);
		}else {
			return (this.dailyValue * Parking.superVHFees) + (this.dailyValue * time);
		}
	}

}
