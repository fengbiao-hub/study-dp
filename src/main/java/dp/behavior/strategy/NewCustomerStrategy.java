package dp.behavior.strategy;

public class NewCustomerStrategy implements Strategy {

	@Override
	public double getPrice(double standradPrice) {
		return standradPrice * 0.9;
	}

}
