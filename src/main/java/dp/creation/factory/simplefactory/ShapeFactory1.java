package dp.creation.factory.simplefactory;

/**
 * 简单工厂模式之工厂类
 *
 * @author fengb
 * @date 2020年11月16日 上午11:28:07
 */
public class ShapeFactory1 {

	public static Shape getShape(String type, int... args) {
		if ("circle".equalsIgnoreCase(type)) {
			return new Circle(args[0]);
		} else if ("square".equalsIgnoreCase(type)) {
			return new Square(args[0]);
		} else {
			return null;
		}
	}
}
