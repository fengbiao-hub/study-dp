package dp.behavior.observer.test;

import dp.behavior.observer.ObserverA;
import dp.behavior.observer.ObserverB;
import dp.behavior.observer.ObserverC;
import dp.behavior.observer.Subject;

/**
 * 测试观察者模式
 *
 * @author fengb
 * @date 2020年11月30日 上午9:52:57
 */
public class TestObserver {

	public static void main(String[] args) {
		Subject subject = new Subject();
		ObserverA observer1 = new ObserverA();
		ObserverA observer2 = new ObserverA();
		ObserverB observer3 = new ObserverB();
		ObserverC observer4 = new ObserverC();
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		subject.register(observer4);
		System.out.println(subject.getState());
		System.out.println(observer1.getMyState());
		System.out.println(observer2.getMyState());
		System.out.println(observer3.getMyState());
		System.out.println(observer4.getMyState());
		System.out.println("===================================================");
		subject.setState(14);
		System.out.println(subject.getState());
		System.out.println(observer1.getMyState());
		System.out.println(observer2.getMyState());
		System.out.println(observer3.getMyState());
		System.out.println(observer4.getMyState());

	}
}
