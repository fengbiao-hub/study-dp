package dp.creation.factory.abstractfactory;

/**
 * 抽象工厂模式之抽象接口
 *
 * @author fengb
 * @date 2020年11月16日 下午1:56:12
 */
public interface Tyre {

	void info();
}

/**
 * 抽象工厂模式之接口实现
 *
 * @author fengb
 * @date 2020年11月16日 下午2:07:41
 */
class HighLevelTyre implements Tyre {

	@Override
	public void info() {
		System.out.println("双层防滑轮胎！有效期5年。");
	}
}

/**
 * 抽象工厂模式之接口实现
 *
 * @author fengb
 * @date 2020年11月16日 下午2:08:01
 */
class LowLevelTyre implements Tyre {

	@Override
	public void info() {
		System.out.println("山寨版轮胎！有效期为1年，请及时更换，否则后果自负！");
	}

}