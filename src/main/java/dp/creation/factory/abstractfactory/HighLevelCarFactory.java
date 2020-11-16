package dp.creation.factory.abstractfactory;

/**
 * 抽象工厂模式之工厂实现类
 *
 * @author fengb
 * @date 2020年11月16日 下午2:15:21
 */
public class HighLevelCarFactory implements CarFactory {

	@Override
	public Engine newEngine() {
		return new HighLevelEngine();
	}

	@Override
	public Tyre newTyre() {
		return new HighLevelTyre();
	}

	@Override
	public Seat newSeat() {
		return new HighLevelSeat();
	}

}
