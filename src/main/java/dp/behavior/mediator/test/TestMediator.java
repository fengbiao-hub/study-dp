package dp.behavior.mediator.test;

import dp.behavior.mediator.Department;
import dp.behavior.mediator.Development;
import dp.behavior.mediator.Finance;
import dp.behavior.mediator.Leader;
import dp.behavior.mediator.Market;
import dp.behavior.mediator.Mediator;

public class TestMediator {

	public static void main(String[] args) {
		Mediator leader = new Leader();
		Department finance = new Finance(leader);
		Department development = new Development(leader);
		Department market = new Market(leader);
		finance.selfAction();
		finance.outAction();
		market.outAction();
		
	}
}
