package dp.creation.factory.abstractfactory;

/**
 * 抽象工厂模式之工厂实现类
 *
 * @author fengb
 * @date 2020年11月16日 下午2:16:34
 */
public class LowLevelCarFactory implements CarFactory {

	@Override
	public Engine newEngine() {
		return new LowLevelEngine();
	}

	@Override
	public Tyre newTyre() {
		return new LowLevelTyre();
	}

	@Override
	public Seat newSeat() {
		return new LowLevelSeat();
	}

}
