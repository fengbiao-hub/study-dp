package dp.creation.singleton;

/**
 * 单例模式之饿汉式
 *
 * @author fengb
 * @date 2020年11月13日 下午1:53:01
 */
public class SingletonObject1 {

	private static SingletonObject1 instance = new SingletonObject1();

	private SingletonObject1() {
	}

	public static SingletonObject1 getInstance() {
		return instance;
	}

}
