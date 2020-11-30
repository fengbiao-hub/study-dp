package dp.behavior.observer.test;

import dp.behavior.observer.ObserverD;
import dp.behavior.observer.Subject1;

public class TestObserver2 {

	public static void main(String[] args) {
		Subject1 subject = new Subject1();
		ObserverD o1 = new ObserverD("人民日报");
		ObserverD o2 = new ObserverD("新青年报");
		subject.addObserver(o1);
		subject.addObserver(o2);
		subject.setNews("2021年节假日公布！五一休息5天！");
	}
}
