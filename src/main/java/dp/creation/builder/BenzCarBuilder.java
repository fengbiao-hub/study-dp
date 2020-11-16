package dp.creation.builder;

/**
 * 建造者模式之构建实现
 *
 * @author fengb
 * @date 2020年11月16日 下午3:20:11
 */
public class BenzCarBuilder implements CarBuilder {

	@Override
	public Engine buildEngine() {
		return new HighLevelEngine();
	}

	@Override
	public Seat buildSeat() {
		return new HighLevelSeat();
	}

	@Override
	public Tyre buildTyre() {
		return new HighLevelTyre();
	}

}
