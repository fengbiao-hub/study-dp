package dp.creation.factory.simplefactory;

/**
 * 简单工厂模式之接口实现类
 *
 * @author fengb
 * @date 2020年11月16日 上午11:23:09
 */
public class Square implements Shape {

	private int length;

	public Square(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public double getC() {
		double result = 4 * length;
		System.out.println("边长为" + length + "的正方形周长为" + result);
		return result;
	}

}
