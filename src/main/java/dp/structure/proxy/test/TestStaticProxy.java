package dp.structure.proxy.test;

import dp.structure.proxy.ProxyStar;
import dp.structure.proxy.RealStar;
import dp.structure.proxy.Star;

/**
 * 测试静态代理
 *
 * @author fengb
 * @date 2020年11月23日 上午10:50:34
 */
public class TestStaticProxy {

	public static void main(String[] args) {
		Star jay = new RealStar();
		Star proxy = new ProxyStar(jay);
		proxy.sign();
		proxy.sing();
		proxy.makeMoney();
	}
}
