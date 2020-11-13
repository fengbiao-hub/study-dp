package dp.creation.singleton;

/**
 * 单例模式之懒汉式
 *
 * @author fe0ngb
 * @date 2020年11月13日 下午1:57:06
 */
public class SingletonObject2 {

	private static SingletonObject2 instance; // 懒加载

	private SingletonObject2() {
	}

	public static synchronized SingletonObject2 getInstance() {
		if (null == instance) {
			instance = new SingletonObject2();
		}
		return instance;
	}
}
