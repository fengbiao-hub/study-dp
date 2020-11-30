package dp.behavior.memento.test;

import dp.behavior.memento.CareTaker;
import dp.behavior.memento.User;

public class TestMemento {

	public static void main(String[] args) {
		User user = new User("fengb", 18, "小彪彪成年啦！");
		System.out.println(user);
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(user.memento());
		user.setAge(22);
		user.setDescription("小彪彪赚了人生第一桶金！");
		System.out.println(user);
		user.recovery(careTaker.getMemento());
		System.out.println(user);
	}
}
