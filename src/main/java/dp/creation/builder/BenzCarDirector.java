package dp.creation.builder;

/**
 * 建造者模式之装配接口
 *
 * @author fengb
 * @date 2020年11月16日 下午3:21:21
 */
public class BenzCarDirector implements CarDirector {

	private CarBuilder carBuilder;

	public void setCarBuilder(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	@Override
	public Car directCar() {
		Car car = new Car();
		Engine engine = carBuilder.buildEngine();
		Seat seat = carBuilder.buildSeat();
		Tyre tyre = carBuilder.buildTyre();
		car.setEngine(engine);
		car.setSeat(seat);
		car.setTyre(tyre);
		return car;
	}

}
