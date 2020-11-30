package dp.behavior.strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void getPrice(double price) {
		System.out.println("打折后结果为：" + strategy.getPrice(price));
	}
}
