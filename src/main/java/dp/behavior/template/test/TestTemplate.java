package dp.behavior.template.test;

import dp.behavior.template.BankBusiness;
import dp.behavior.template.BankCheckBalanceBusiness;
import dp.behavior.template.BankDepositBusiness;

/**
 * 测试模板方法类
 *
 * @author fengb
 * @date 2020年11月30日 下午5:01:55
 */
public class TestTemplate {

	public static void main(String[] args) {
		BankBusiness checkBalanceBusiness = new BankCheckBalanceBusiness();
		BankBusiness depositBusiness = new BankDepositBusiness();
		checkBalanceBusiness.process();
		depositBusiness.process();
	}
}
