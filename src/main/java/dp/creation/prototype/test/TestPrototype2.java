package dp.creation.prototype.test;

import java.util.Date;

import dp.creation.prototype.Man;
import dp.creation.prototype.Sleep2;

/**
 * 测试原型模式深克隆
 *
 * @author fengb
 * @date 2020年11月16日 下午4:25:14
 */
public class TestPrototype2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Man man = new Man("FengBiao");
		System.out.println(man);
		Date date = new Date(97, 11, 1, 12, 0, 0);
		Sleep2 sleep = new Sleep2("sleep", date, man);
		System.out.println(sleep);
		System.out.println(sleep.string() + sleep.string());
		Sleep2 clone = (Sleep2) sleep.clone();
		System.out.println(clone);
		System.out.println(clone.string() + clone.string());

		date.setYear(120);
		man.setName("ZhangChunyan");
		System.out.println(sleep.string() + sleep.getOwner().string());
		System.out.println(clone.string() + clone.getOwner().string());
	}
}
