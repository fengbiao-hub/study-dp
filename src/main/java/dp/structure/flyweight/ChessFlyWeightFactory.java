package dp.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式-享元工厂类
 *
 * @author fengb
 * @date 2020年12月1日 下午11:50:08
 */
public class ChessFlyWeightFactory {

	private Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

	public ChessFlyWeight getChess(String color) {
		if (map.get(color) != null) {
			return map.get(color);
		} else {
			Chess chess = new Chess(color);
			map.put(color, chess);
			return chess;
		}
	}
}
