package dp.behavior.memento;

/**
 * 备忘录模式-备份
 *
 * @author fengb
 * @date 2020年11月30日 下午1:58:35
 */
public class UserMemento {

	private String name;
	private int age;
	private String description;

	public UserMemento() {
		super();
	}

	public UserMemento(User user) {
		super();
		this.name = user.getName();
		this.age = user.getAge();
		this.description = user.getDescription();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UserMemento [name=" + name + ", age=" + age + ", description=" + description + "]";
	}

}
