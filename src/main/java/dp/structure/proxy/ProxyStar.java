package dp.structure.proxy;

/**
 * 静态代理模式-代理角色
 *
 * @author fengb
 * @date 2020年11月23日 上午10:49:11
 */
public class ProxyStar implements Star {

	private Star realStar;

	public ProxyStar(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public void sign() {
		System.out.println("代理对象-签合同！");
	}

	@Override
	public void sing() {
		realStar.sing();
	}

	@Override
	public void makeMoney() {
		System.out.println("代理对象-赚钱！");
	}

}
