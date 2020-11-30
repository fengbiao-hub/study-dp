package dp.behavior.mediator;

import java.util.Date;

public class Finance implements Department {

	private Mediator mediator;

	public Finance(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("Finance", this);
	}

	@Override
	public void selfAction() {
		System.out.println("打钱");
	}

	@Override
	public void outAction() {
		System.out.println("资金链已断，，，公司于" + new Date() + "倒闭！");
	}

}
