package dp.creation.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import dp.creation.singleton.SingletonObject1;

/**
 * 测试通过反射破解单例
 *
 * @author fengb
 * @date 2020年11月15日 下午11:36:11
 */
public class TestSingleton1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingletonObject1 s1 = SingletonObject1.getInstance();
		SingletonObject1 s2 = SingletonObject1.getInstance();
		System.out.println("s1: " + s1 + "\ns2: " + s2 + "\ns1==s2: " + (s1 == s2));
		Class<SingletonObject1> clazz = (Class<SingletonObject1>) Class
				.forName("dp.creation.singleton.SingletonObject1");
		Constructor<SingletonObject1> constructor = clazz.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		SingletonObject1 s3 = constructor.newInstance(null);
		System.out.println("s3: " + s3);
		System.out.println("s1==s3: " + (s1 == s3));

		SingletonObject6 s4 = SingletonObject6.getInstance();
		SingletonObject6 s5 = SingletonObject6.getInstance();
		System.out.println("s4: " + s4 + "\ns5: " + s5 + "\ns4==s5: " + (s4 == s5));
		Class<SingletonObject6> clazz2 = (Class<SingletonObject6>) Class
				.forName("dp.creation.singleton.test.SingletonObject6");
		Constructor<SingletonObject6> constructor2 = clazz2.getDeclaredConstructor(null);
		constructor2.setAccessible(true);
		SingletonObject6 s6 = constructor2.newInstance(null);
		System.out.println("s6: " + s6);
		System.out.println("s4==s6: " + (s4 == s6));
	}
}

/**
 * 解决方案之防止反射破解单例
 *
 * @author fengb
 * @date 2020年11月15日 下午11:57:58
 */
class SingletonObject6 {
	private static SingletonObject6 instance = new SingletonObject6();

	private SingletonObject6() {
		if (instance != null) {
			throw new RuntimeException("单例模式无法创建！");
		}
	}

	public static SingletonObject6 getInstance() {
		return instance;
	}
}