package dp.creation.factory.abstractfactory;

/**
 * 抽象工厂模式之抽象接口
 *
 * @author fengb
 * @date 2020年11月16日 下午1:56:35
 */
public interface Seat {

	void info();
}

/**
 * 抽象工厂模式之接口实现
 *
 * @author fengb
 * @date 2020年11月16日 下午2:10:27
 */
class HighLevelSeat implements Seat {

	@Override
	public void info() {
		System.out.println("顶配沙发，人工智能，解除您一天的疲劳！");
	}

}

/**
 * 抽象工厂之接口实现
 *
 * @author fengb
 * @date 2020年11月16日 下午2:10:44
 */
class LowLevelSeat implements Seat {

	@Override
	public void info() {
		System.out.println("能坐就行！");
	}

}