package dp.structure.decorator;

/**
 * 装饰器模式-真实对象
 *
 * @author fengb
 * @date 2020年12月1日 下午6:43:46
 */
public class Car implements ICar {

	@Override
	public void move() {
		System.out.println("汽车在地上跑~");
	}

}
