package dp.behavior.state;

public class YellowLight implements State {

	@Override
	public void handle() {
		System.out.println("黄灯！请小心通行，车辆注意礼让行人！");
	}

}
