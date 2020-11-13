package dp.creation.singleton;

/**
 * 单例模式之静态内部类
 *
 * @author fengb
 * @date 2020年11月13日 下午3:21:00
 */
public class SingletonObject4 {

	public static class SingletonInnerClass {
		private static SingletonObject4 instance = new SingletonObject4();
	}

	private SingletonObject4() {
	}

	public static SingletonObject4 getInstance() {
		return SingletonInnerClass.instance;
	}
}
