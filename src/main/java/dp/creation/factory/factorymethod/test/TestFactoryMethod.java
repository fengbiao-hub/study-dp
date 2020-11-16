package dp.creation.factory.factorymethod.test;

import dp.creation.factory.factorymethod.CircleShapeFactory;
import dp.creation.factory.factorymethod.Shape;
import dp.creation.factory.factorymethod.SquareShapeFactory;

/**
 * 测试工厂方法模式
 *
 * @author fengb
 * @date 2020年11月16日 下午12:48:05
 */
public class TestFactoryMethod {

	public static void main(String[] args) {
		Shape circle = new CircleShapeFactory().getShape(3);
		Shape square = new SquareShapeFactory().getShape(3);
		circle.getC();
		square.getC();
	}
}
