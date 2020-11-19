package dp.structure.adapter.test;

import dp.structure.adapter.Client;
import dp.structure.adapter.Keyboard;
import dp.structure.adapter.LowLevelAdapter;
import dp.structure.adapter.Target;

/**
 * 测试适配器模式
 *
 * @author fengb
 * @date 2020年11月19日 下午9:49:54
 */
public class TestAdapter1 {

	public static void main(String[] args) {
		Client client = new Client(); // 模拟笔记本电脑
		Keyboard keyboard = new Keyboard(); // 模拟键盘
		Target target = new LowLevelAdapter(); // 模拟适配器
		client.request(target); // 模拟打字
	}
}
