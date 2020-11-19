package dp.structure.adapter;

/**
 * 适配器模式-客户端
 *
 * @author fengb
 * @date 2020年11月19日 下午9:35:21
 */
public class Client {

	public void request(Target target) {
		target.handle();
	}

}
