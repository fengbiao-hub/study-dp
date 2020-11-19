package dp.structure.adapter;

/**
 * 适配器模式-适配器2
 *
 * @author fengb
 * @date 2020年11月19日 下午9:52:12
 */
public class HighLevelAdapter implements Target {

	private Keyboard keyboard;

	public HighLevelAdapter(Keyboard keyboard) {
		super();
		this.keyboard = keyboard;
	}

	@Override
	public void handle() {
		keyboard.typing();
	}

}
