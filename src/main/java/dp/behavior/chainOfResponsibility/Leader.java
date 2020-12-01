package dp.behavior.chainOfResponsibility;

/**
 * 责任链模式-领导抽象类
 *
 * @author fengb
 * @date 2020年12月1日 下午4:45:00
 */
public abstract class Leader {

	protected String name;
	protected Leader nextLeader;

	public Leader(String name) {
		super();
		this.name = name;
	}

	public Leader getNextLeader() {
		return nextLeader;
	}

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	public abstract void handle(LeavelRequest request);
}
