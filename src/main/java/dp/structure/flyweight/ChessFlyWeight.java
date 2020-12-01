package dp.structure.flyweight;

/**
 * 享元模式-享元抽象类
 *
 * @author fengb
 * @date 2020年12月1日 下午11:41:08
 */
public interface ChessFlyWeight {

	void setColor(String color);

	String getColor();

	void display(Coordinate coordinate);
}
