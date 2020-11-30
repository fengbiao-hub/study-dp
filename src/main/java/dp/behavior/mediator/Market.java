package dp.behavior.mediator;

public class Market implements Department {

	private Mediator mediator;

	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("Market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("调研需求，卖产品");
	}

	@Override
	public void outAction() {
		System.out.println("需要报销消费");
		mediator.command("Finance");
		System.out.println("给研发提需求");
		mediator.command("Development");
	}

}
