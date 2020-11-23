package dp.structure.proxy;

/**
 * 静态代理模式-真实角色
 *
 * @author fengb
 * @date 2020年11月23日 上午10:39:13
 */
public class RealStar implements Star {

	@Override
	public void sign() {
		System.out.println("真实角色签合同！");
	}

	@Override
	public void sing() {
		System.out.println("真实角色唱歌！");
	}

	@Override
	public void makeMoney() {
		System.out.println("真实角色挣钱！");
	}

}
