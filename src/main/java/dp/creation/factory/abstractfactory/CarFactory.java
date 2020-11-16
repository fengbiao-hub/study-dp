package dp.creation.factory.abstractfactory;

/**
 * 抽象工厂模式之工厂接口
 *
 * @author fengb
 * @date 2020年11月16日 下午2:12:59
 */
public interface CarFactory {

	Engine newEngine();

	Tyre newTyre();

	Seat newSeat();
}
