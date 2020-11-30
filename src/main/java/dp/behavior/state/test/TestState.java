package dp.behavior.state.test;

import dp.behavior.state.GreenLight;
import dp.behavior.state.RedLight;
import dp.behavior.state.State;
import dp.behavior.state.TrafficLightsContext;
import dp.behavior.state.YellowLight;

/**
 * 测试状态模式
 *
 * @author fengb
 * @date 2020年11月30日 下午3:48:39
 */
public class TestState {

	public static void main(String[] args) {
		State redLight = new RedLight();
		State greenLight = new GreenLight();
		State yellowLight = new YellowLight();
		TrafficLightsContext context = new TrafficLightsContext();
		context.setState(yellowLight);
		context.setState(greenLight);
		context.setState(redLight);
	}
}
