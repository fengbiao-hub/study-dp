package dp.behavior.observer;

import java.util.Observable;

public class Subject1 extends Observable {

	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
		setChanged();
		notifyObservers("2020-11-30");
	}

}
