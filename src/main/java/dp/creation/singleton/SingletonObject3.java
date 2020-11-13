package dp.creation.singleton;

/**
 * 单例模式之双重检查锁式
 *
 * @author fengb
 * @date 2020年11月13日 下午3:17:11
 */
public class SingletonObject3 {

	private static SingletonObject3 instance;

	private SingletonObject3() {
	}

	public static SingletonObject3 getInstance() {
		if (null == instance) {
			synchronized (SingletonObject3.class) {
				if (null == instance) {
					instance = new SingletonObject3();
				}
			}
		}
		return instance;
	}
}
