package dp.structure.flyweight.test;

import dp.structure.flyweight.ChessFlyWeight;
import dp.structure.flyweight.ChessFlyWeightFactory;
import dp.structure.flyweight.Coordinate;

/**
 * 测试享元模式
 *
 * @author fengb
 * @date 2020年12月1日 下午11:59:20
 */
public class TestFlyWeight {

	public static void main(String[] args) {
		ChessFlyWeightFactory factory = new ChessFlyWeightFactory();
		ChessFlyWeight chess1 = factory.getChess("黑色");
		ChessFlyWeight chess2 = factory.getChess("黑色");
		System.out.println(chess1);
		System.out.println(chess2);
		chess1.display(new Coordinate(10, 10));
		chess1.display(new Coordinate(5, 5));
	}
}
