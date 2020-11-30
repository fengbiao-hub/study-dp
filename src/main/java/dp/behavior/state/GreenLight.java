package dp.behavior.state;

public class GreenLight implements State {

	@Override
	public void handle() {
		System.out.println("绿灯行！");
	}

}
