package dp.behavior.chainOfResponsibility;

public class ProjectManager extends Leader {

	public ProjectManager(String name) {
		super(name);
	}

	@Override
	public void handle(LeavelRequest request) {
		if (request.getLeavelDays() <= 5) {
			System.out.println("请假" + request + "通过！审批人：" + name);
		} else {
			if (this.nextLeader != null) {
				System.out.println(name + "无法审批此请假，请求下一级领导" + this.nextLeader.name);
				this.nextLeader.handle(request);
			} else {
				System.out.println("请假" + request + "未通过！");
			}
		}
	}

}
