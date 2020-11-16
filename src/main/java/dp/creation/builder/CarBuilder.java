package dp.creation.builder;

/**
 * 建造者模式之构建接口
 *
 * @author fengb
 * @date 2020年11月16日 下午3:13:49
 */
public interface CarBuilder {

	Engine buildEngine();

	Seat buildSeat();

	Tyre buildTyre();
}
