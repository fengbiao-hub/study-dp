package dp.behavior.mediator;

/**
 * 中介者模式-中介抽象接口
 *
 * @author fengb
 * @date 2020年11月24日 下午5:33:04
 */
public interface Mediator {

	void register(String dName, Department department);

	void command(String dName);
}
