package dp.creation.prototype;

import java.util.Date;

/**
 * 原型模式之实体类
 *
 * @author fengb
 * @date 2020年11月16日 下午4:04:47
 */
public class Sleep implements Cloneable {

	private String name;
	private Date birthday;
	private Man owner;

	public Sleep() {
		super();
	}

	public Sleep(String name, Date birthday, Man owner) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Man getOwner() {
		return owner;
	}

	public void setOwner(Man owner) {
		this.owner = owner;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Object clone = super.clone();
		return clone;
	}

	public String string() {
		return "Sleep [name=" + name + ", birthday=" + birthday + ", owner=" + owner + "]";
	}

}
