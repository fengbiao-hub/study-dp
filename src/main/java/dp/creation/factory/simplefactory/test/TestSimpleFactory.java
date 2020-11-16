package dp.creation.factory.simplefactory.test;

import dp.creation.factory.simplefactory.Shape;
import dp.creation.factory.simplefactory.ShapeFactory1;

/**
 * 测试简单工厂模式
 *
 * @author fengb
 * @date 2020年11月16日 上午11:36:18
 */
public class TestSimpleFactory {

	public static void main(String[] args) {
		Shape circle = ShapeFactory1.getShape("circle", 2);
		Shape square = ShapeFactory1.getShape("square", 2);
		circle.getC();
		square.getC();
	}
}
