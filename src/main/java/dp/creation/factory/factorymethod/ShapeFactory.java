package dp.creation.factory.factorymethod;

/**
 * 工厂方法模式之工厂抽象接口
 *
 * @author fengb
 * @date 2020年11月16日 上午11:57:45
 */
public interface ShapeFactory {

	Shape getShape(int... args);
}
