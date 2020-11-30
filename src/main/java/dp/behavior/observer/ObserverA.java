package dp.behavior.observer;

/**
 * 观察者模式-观察者实现
 *
 * @author fengb
 * @date 2020年11月30日 上午9:52:37
 */
public class ObserverA implements IObserver {

	private int myState;

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

	@Override
	public void update(Subject subject) {
		this.myState = subject.getState();
	}

}
