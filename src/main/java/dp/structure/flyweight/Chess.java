package dp.structure.flyweight;

/**
 * 享元模式-具体享元类
 *
 * @author fengb
 * @date 2020年12月1日 下午11:48:16
 */
public class Chess implements ChessFlyWeight {

	private String color;

	public Chess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println("颜色：" + color);
		System.out.println("坐标：[" + coordinate.getX() + "," + coordinate.getY() + "]");
	}

}
