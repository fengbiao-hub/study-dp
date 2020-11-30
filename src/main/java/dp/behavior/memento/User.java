package dp.behavior.memento;

/**
 * 备忘录模式-原始对象
 *
 * @author fengb
 * @date 2020年11月30日 下午2:02:00
 */
public class User {

	private String name;
	private int age;
	private String description;

	public User() {
		super();
	}

	public User(String name, int age, String description) {
		super();
		this.name = name;
		this.age = age;
		this.description = description;
	}

	public UserMemento memento() {
		System.out.println("对数据进行备份！");
		return new UserMemento(this);
	}

	public void recovery(UserMemento memento) {
		this.name = memento.getName();
		this.age = memento.getAge();
		this.description = memento.getDescription();
		System.out.println("撤销为备份数据！");
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
		return "User [name=" + name + ", age=" + age + ", description=" + description + "]";
	}

}
