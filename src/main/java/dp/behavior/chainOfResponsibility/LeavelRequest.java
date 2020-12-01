package dp.behavior.chainOfResponsibility;

/**
 * 责任链模式-请假
 *
 * @author fengb
 * @date 2020年12月1日 下午4:33:38
 */
public class LeavelRequest {

	private String empName;
	private int leavelDays;
	private String reason;

	public LeavelRequest() {
		super();
	}

	public LeavelRequest(String empName, int leavelDays, String reason) {
		super();
		this.empName = empName;
		this.leavelDays = leavelDays;
		this.reason = reason;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getLeavelDays() {
		return leavelDays;
	}

	public void setLeavelDays(int leavelDays) {
		this.leavelDays = leavelDays;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "LeavelRequest [empName=" + empName + ", leavelDays=" + leavelDays + ", reason=" + reason + "]";
	}

}
