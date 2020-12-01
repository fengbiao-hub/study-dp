package dp.structure.flyweight;

/**
 * 享元模式-非共享享元类（外部状态）
 *
 * @author fengb
 * @date 2020年12月1日 下午11:43:41
 */
public class Coordinate {

	private int x;
	private int y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
