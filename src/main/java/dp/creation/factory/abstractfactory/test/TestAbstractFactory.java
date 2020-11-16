package dp.creation.factory.abstractfactory.test;

import dp.creation.factory.abstractfactory.Engine;
import dp.creation.factory.abstractfactory.HighLevelCarFactory;
import dp.creation.factory.abstractfactory.LowLevelCarFactory;
import dp.creation.factory.abstractfactory.Seat;

/**
 * 测试抽象工厂模式
 *
 * @author fengb
 * @date 2020年11月16日 下午2:18:40
 */
public class TestAbstractFactory {

	public static void main(String[] args) {
		HighLevelCarFactory highLevelCarFactory = new HighLevelCarFactory();
		Engine engine = highLevelCarFactory.newEngine();
		engine.start();
		engine.run();
		LowLevelCarFactory lowLevelCarFactory = new LowLevelCarFactory();
		Seat seat = lowLevelCarFactory.newSeat();
		seat.info();
	}
}
