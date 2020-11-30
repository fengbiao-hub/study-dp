package dp.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式-被观察者
 *
 * @author fengb
 * @date 2020年11月27日 下午12:47:47
 */
public class Subject {

	private List<IObserver> observers = new ArrayList<IObserver>();
	private int state;

	public Subject() {
		super();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		System.out.println("被观察者发生变化，通知所有观察者！");
		notifyAllObservers();
	}

	public void register(IObserver observer) {
		observers.add(observer);
	}

	public void remove(IObserver observer) {
		observers.remove(observer);
	}

	public void notifyAllObservers() {
		for (IObserver observer : observers) {
			observer.update(this);
		}
	}
}
