package dp.creation.prototype;

import java.util.Date;

/**
 * 原型模式之实体类之实现深克隆
 *
 * @author fengb
 * @date 2020年11月16日 下午4:04:47
 */
public class Sleep2 implements Cloneable {

	private String name;
	private Date birthday;
	private Man owner;

	public Sleep2() {
		super();
	}

	public Sleep2(String name, Date birthday, Man owner) {
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
		Sleep2 sleep = (Sleep2) clone;
		sleep.setBirthday((Date) this.birthday.clone()); // 深克隆
		sleep.setOwner((Man) this.owner.clone());
		return clone;
	}

	public String string() {
		return "Sleep2 [name=" + name + ", birthday=" + birthday + ", owner=" + owner + "]";
	}

}
