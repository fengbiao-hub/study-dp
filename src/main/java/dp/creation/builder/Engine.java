package dp.creation.builder;

/**
 * 建造者模式之抽象接口
 *
 * @author fengb
 * @date 2020年11月16日 下午1:54:26
 */
public interface Engine {

	void start();

	void run();
}

/**
 * 建造者模式之接口实现
 *
 * @author fengb
 * @date 2020年11月16日 下午1:59:52
 */
class HighLevelEngine implements Engine {

	@Override
	public void start() {
		System.out.println("发动机启动成功！");
	}

	@Override
	public void run() {
		System.out.println("发动机正常运转，车速最高可达80km/h");
	}

}

/**
 * 建造者模式之接口实现
 *
 * @author fengb
 * @date 2020年11月16日 下午2:04:20
 */
class LowLevelEngine implements Engine {

	@Override
	public void start() {
		System.out.println("发动机启动中，请等待！");
		System.out.println("经过您的努力，30s后，发动机终于启动成功！");
	}

	@Override
	public void run() {
		System.out.println("发动机正常运转，车速最高可达30km/h，超速可能导致发动机停止工作！");
	}

}
