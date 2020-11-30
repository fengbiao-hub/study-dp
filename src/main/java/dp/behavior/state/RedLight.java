package dp.behavior.state;

/**
 * 状态模式-具体状态实现类
 *
 * @author fengb
 * @date 2020年11月30日 下午3:51:56
 */
public class RedLight implements State {

	@Override
	public void handle() {
		System.out.println("红灯停！等待其他方向行人车辆通行！");
	}

}
