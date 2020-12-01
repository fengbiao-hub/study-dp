package dp.behavior.chainOfResponsibility.test;

import dp.behavior.chainOfResponsibility.Boss;
import dp.behavior.chainOfResponsibility.Leader;
import dp.behavior.chainOfResponsibility.LeavelRequest;
import dp.behavior.chainOfResponsibility.ProjectManager;
import dp.behavior.chainOfResponsibility.TeamLeader;

/**
 * 测试责任链模式
 *
 * @author fengb
 * @date 2020年12月1日 下午5:01:52
 */
public class TestChainOfResponsibility {

	public static void main(String[] args) {
		LeavelRequest request = new LeavelRequest("胡雍", 30, "我要回家娶媳妇！");
		Leader teamLeader = new TeamLeader("fengb");
		Leader projectManager = new ProjectManager("zhout");
		Leader boss = new Boss("chensh");
		teamLeader.setNextLeader(projectManager);
		projectManager.setNextLeader(boss);
		teamLeader.handle(request);
	}
}
