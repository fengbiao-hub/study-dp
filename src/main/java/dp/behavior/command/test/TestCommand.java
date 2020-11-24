package dp.behavior.command.test;

import dp.behavior.command.Command;
import dp.behavior.command.ContextCommand;
import dp.behavior.command.Invoke;
import dp.behavior.command.Receiver;

/**
 * 测试命令模式
 *
 * @author fengb
 * @date 2020年11月24日 下午5:06:18
 */
public class TestCommand {

	public static void main(String[] args) {
		Command command = new ContextCommand("开炮！", new Receiver());
		Invoke invoke = new Invoke(command);
		invoke.call();
	}
}
