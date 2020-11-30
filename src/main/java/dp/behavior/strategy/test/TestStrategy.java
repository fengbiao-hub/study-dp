package dp.behavior.strategy.test;

import dp.behavior.strategy.Context;
import dp.behavior.strategy.NewCustomerStrategy;
import dp.behavior.strategy.OldCustomerStrategy;

public class TestStrategy {

	public static void main(String[] args) {
		Context context = new Context(new NewCustomerStrategy());
		context.getPrice(1000);
		context.setStrategy(new OldCustomerStrategy());
		context.getPrice(1000);
		context.setStrategy(x -> 0.7 * x);
		context.getPrice(1000);
	}
}
