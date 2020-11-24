package dp.behavior.command;

/**
 * 命令模式-命令执行者
 *
 * @author fengb
 * @date 2020年11月24日 下午4:52:55
 */
public class Receiver {

	public void action(String command) {
		System.out.println("执行者执行命令：" + command);
	}
}
