package dp.behavior.command;

/**
 * 调用者
 *
 * @author fengb
 * @date 2020年11月24日 下午4:59:29
 */
public class Invoke {

	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}

	public void call() {
		System.out.println("调用者准备发起命令");
		command.execute();
		System.out.println("调用者执行命令完成");
	}
}
