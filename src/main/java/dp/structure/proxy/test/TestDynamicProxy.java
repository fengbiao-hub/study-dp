package dp.structure.proxy.test;

import java.lang.reflect.Proxy;

import dp.structure.proxy.RealStar;
import dp.structure.proxy.Star;
import dp.structure.proxy.StarHandler;

/**
 * 测试动态代理类
 *
 * @author fengb
 * @date 2020年11月23日 上午11:34:08
 */
public class TestDynamicProxy {

	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler starHandler = new StarHandler(realStar);
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Star.class },
				starHandler);
		proxy.sign();
		proxy.sing();
		proxy.makeMoney();
	}
}
