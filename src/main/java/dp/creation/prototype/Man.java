package dp.creation.prototype;

public class Man implements Cloneable {

	private String name;

	public Man() {
		super();
	}

	public Man(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String string() {
		return "Man [name=" + name + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
