package dp.creation.prototype.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 测试通过序列化和反序列化实现深克隆
 *
 * @author fengb
 * @date 2020年11月16日 下午5:02:36
 */
public class TestPrototype3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date date = new Date(97, 11, 1, 12, 0, 0);
		Sleep sleep = new Sleep("sleep", date);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(sleep);
		byte[] byteArray = baos.toByteArray();
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Sleep clone = (Sleep) ois.readObject();
		System.out.println(sleep + ", " + sleep.string());
		System.out.println(clone + ", " + clone.string());
		System.out.println("修改日期");
		date.setYear(120);
		System.out.println(sleep + ", " + sleep.string());
		System.out.println(clone + ", " + clone.string());
	}
}

class Sleep implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private Date birthday;

	public Sleep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
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

	public String string() {
		return "Sleep [name=" + name + ", birthday=" + birthday + "]";
	}

}