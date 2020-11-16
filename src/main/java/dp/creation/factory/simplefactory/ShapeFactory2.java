package dp.creation.factory.simplefactory;

/**
 * 简单工厂模式之工厂类
 *
 * @author fengb
 * @date 2020年11月16日 上午11:30:43
 */
public class ShapeFactory2 {

	public static Shape getCircle(int redius) {
		return new Circle(redius);
	}

	public static Shape getSquare(int length) {
		return new Square(length);
	}
}
