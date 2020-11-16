package dp.creation.factory.factorymethod;

/**
 * 工厂方法模式之工厂实现类
 *
 * @author fengb
 * @date 2020年11月16日 下午12:43:04
 */
public class CircleShapeFactory implements ShapeFactory {

	@Override
	public Shape getShape(int... args) {
		return new Circle(args[0]);
	}

}
