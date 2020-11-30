package dp.behavior.strategy;

public class OldCustomerStrategy implements Strategy {

	@Override
	public double getPrice(double standradPrice) {
		return standradPrice * 0.8;
	}

}
