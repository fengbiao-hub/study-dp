package dp.behavior.command;

/**
 * 命令模式-具体实现
 *
 * @author fengb
 * @date 2020年11月24日 下午4:56:35
 */
public class ContextCommand implements Command {

	private String command;
	private Receiver receiver;

	public ContextCommand(String command, Receiver receiver) {
		super();
		this.command = command;
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("命令执行前处理");
		receiver.action(command);
		System.out.println("命令执行后处理");
	}

}
