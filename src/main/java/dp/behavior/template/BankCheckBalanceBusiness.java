package dp.behavior.template;

/**
 * 模板方法模式-模板实现类
 *
 * @author fengb
 * @date 2020年11月30日 下午5:01:03
 */
public class BankCheckBalanceBusiness extends BankBusiness {

	@Override
	public void business() {
		System.out.println("查询余额");
	}

}
