package dp.behavior.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverD implements Observer {

	private String name;

	public ObserverD(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg + ":" + this.name + "得到最新的消息：" + ((Subject1) o).getNews());
	}

}
