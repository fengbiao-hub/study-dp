package dp.creation.factory.factorymethod;

/**
 * 工厂方法模式之接口实现类
 *
 * @author fengb
 * @date 2020年11月16日 上午11:21:13
 */
public class Circle implements Shape {

	private int redius;

	public Circle(int redius) {
		super();
		this.redius = redius;
	}

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}

	@Override
	public double getC() {
		double result = 3.14 * 2 * redius;
		System.out.println("半径为" + redius + "的圆周长为" + result);
		return result;
	}

}
