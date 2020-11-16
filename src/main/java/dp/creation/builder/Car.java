package dp.creation.builder;

/**
 * 建造者模式之构建实体类
 *
 * @author fengb
 * @date 2020年11月16日 下午3:10:10
 */
public class Car {

	private Engine engine;
	private Tyre tyre;
	private Seat seat;

	public void run() {
		seat.info();
		tyre.info();
		engine.start();
		engine.run();
		System.out.println("汽车平稳上路");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", tyre=" + tyre + ", seat=" + seat + "]";
	}

}
