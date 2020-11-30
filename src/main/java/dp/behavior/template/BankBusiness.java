package dp.behavior.template;

/**
 * 模板方法模式-模板类
 *
 * @author fengb
 * @date 2020年11月30日 下午5:01:33
 */
public abstract class BankBusiness {

	public void takeNumber() {
		System.out.println("取号");
	}

	public void sayBye() {
		System.out.println("说再见！");
	}

	public abstract void business();

	public void process() {
		takeNumber();
		business();
		sayBye();
	}
}
