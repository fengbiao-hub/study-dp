package dp.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类-处理类
 *
 * @author fengb
 * @date 2020年11月23日 上午11:32:52
 */
public class StarHandler implements InvocationHandler {

	private Star realStar;

	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getName());
		if ("sing".equals(method.getName())) {
			System.out.println("真实对象处理前");
			Object object = method.invoke(realStar, args);
			System.out.println("真实对象处理后");
			return object;
		} else {
			return method.invoke(realStar, args);
		}
	}

}
