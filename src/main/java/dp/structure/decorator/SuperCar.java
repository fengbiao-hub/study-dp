package dp.structure.decorator;

/**
 * 装饰器模式-装饰角色
 *
 * @author fengb
 * @date 2020年12月1日 下午6:45:24
 */
public class SuperCar implements ICar {

	private ICar car;

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}

}
