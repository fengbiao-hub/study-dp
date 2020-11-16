package dp.creation.builder.test;

import dp.creation.builder.BenzCarBuilder;
import dp.creation.builder.BenzCarDirector;
import dp.creation.builder.Car;

/**
 * 测试建造者模式
 *
 * @author fengb
 * @date 2020年11月16日 下午3:25:39
 */
public class TestBuilder {

	public static void main(String[] args) {
		BenzCarDirector director = new BenzCarDirector();
		director.setCarBuilder(new BenzCarBuilder());
		Car car = director.directCar();
		car.run();
	}
}
