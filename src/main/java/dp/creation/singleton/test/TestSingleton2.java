package dp.creation.singleton.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;

import dp.creation.singleton.SingletonObject2;

/**
 * 测试通过反序列化破解单例
 *
 * @author fengb
 * @date 2020年11月16日 上午12:06:29
 */
public class TestSingleton2 {

	public static void main(String[] args) {
		SingletonObject2 s1 = SingletonObject2.getInstance();
		SingletonObject2 s2 = SingletonObject2.getInstance();
		System.out.println("s1: " + s1 + "\ns2: " + s2 + "\ns1==s2: " + (s1 == s2));

		File file = new File("TestSingleton2.txt");
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(file);
			oos = new ObjectOutputStream(os);
			oos.writeObject(s1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != oos) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (null != os) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		InputStream is = null;
		ObjectInputStream ois = null;
		SingletonObject2 s3 = null;
		try {
			is = new FileInputStream(file);
			ois = new ObjectInputStream(is);
			s3 = (SingletonObject2) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != ois) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (null != is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("s3: " + s3 + "\ns1==s3: " + (s1 == s3));
	}
}

/**
 * 解决方案之防止反序列化破解单例
 *
 * @author fengb
 * @date 2020年11月16日 上午12:31:57
 */
class SingletonObject7 implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	private static SingletonObject7 instance; // 懒加载

	private SingletonObject7() {
	}

	public static synchronized SingletonObject7 getInstance() {
		if (null == instance) {
			instance = new SingletonObject7();
		}
		return instance;
	}

	/**
	 * 反序列化回调
	 * 
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}