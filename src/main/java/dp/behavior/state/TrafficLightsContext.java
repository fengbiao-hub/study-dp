package dp.behavior.state;

/**
 * 状态模式-环境类
 *
 * @author fengb
 * @date 2020年11月30日 下午3:51:29
 */
public class TrafficLightsContext {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("红绿灯发生变化！");
		state.handle();
	}

}
