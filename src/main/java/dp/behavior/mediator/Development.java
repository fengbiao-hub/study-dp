package dp.behavior.mediator;

public class Development implements Department {

	private Mediator mediator;

	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("Development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("专心研发！");
	}

	@Override
	public void outAction() {
		System.out.println("资金不够，等待支援");
		mediator.command("Finance");
	}

}
