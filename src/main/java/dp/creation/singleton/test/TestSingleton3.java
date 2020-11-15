package dp.creation.singleton.test;

import java.util.concurrent.CountDownLatch;

import dp.creation.singleton.SingletonObject1;

/**
 * 测试单例模式各种方法的效率
 *
 * @author fengb
 * @date 2020年11月16日 上午12:34:02
 */
public class TestSingleton3 {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		int count = 10;
		CountDownLatch countDownLatch = new CountDownLatch(count);
		for (int i = 0; i < count; i++) {
			new Thread(() -> {
				for (int j = 0; j < 100000; j++) {
					Object instance = SingletonObject1.getInstance();
				}
				countDownLatch.countDown();
			}).start();
		}
		countDownLatch.await();
		long endTime = System.currentTimeMillis();
		System.out.println("共耗时" + (endTime - startTime) + "ms");
	}
}
