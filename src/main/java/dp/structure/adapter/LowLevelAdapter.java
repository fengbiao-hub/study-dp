package dp.structure.adapter;

/**
 * 适配器模式-适配器1
 *
 * @author fengb
 * @date 2020年11月19日 下午9:43:54
 */
public class LowLevelAdapter extends Keyboard implements Target {

	@Override
	public void handle() {
		super.typing();
	}

}
