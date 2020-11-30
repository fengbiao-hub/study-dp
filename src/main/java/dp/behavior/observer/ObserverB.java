package dp.behavior.observer;

public class ObserverB implements IObserver {

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
