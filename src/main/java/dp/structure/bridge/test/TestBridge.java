package dp.structure.bridge.test;

import dp.structure.bridge.ASUS;
import dp.structure.bridge.Apple;
import dp.structure.bridge.Brand;
import dp.structure.bridge.Computer;
import dp.structure.bridge.Desktop;
import dp.structure.bridge.HuaWei;
import dp.structure.bridge.MobilePhone;
import dp.structure.bridge.Notebook;

/**
 * 测试桥接模式
 *
 * @author fengb
 * @date 2020年11月23日 下午2:12:23
 */
public class TestBridge {

	public static void main(String[] args) {
		Brand apple = new Apple();
		Computer appleDesktop = new Desktop(apple);
		appleDesktop.sale();
		Brand asus = new ASUS();
		Computer asusNotebook = new Notebook(asus);
		asusNotebook.sale();
		Brand huaWei = new HuaWei();
		Computer mobilePhone = new MobilePhone(huaWei);
		mobilePhone.sale();
	}
}
