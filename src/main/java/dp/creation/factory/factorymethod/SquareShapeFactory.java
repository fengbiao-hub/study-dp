package dp.creation.factory.factorymethod;

/**
 * 工厂方法模式之工厂实现类
 *
 * @author fengb
 * @date 2020年11月16日 下午12:44:55
 */
public class SquareShapeFactory implements ShapeFactory {

	@Override
	public Shape getShape(int... args) {
		return new Square(args[0]);
	}

}
