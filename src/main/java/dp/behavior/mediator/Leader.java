package dp.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

public class Leader implements Mediator {

	private Map<String, Department> departments = new HashMap<>();

	@Override
	public void register(String dName, Department department) {
		departments.put(dName, department);
	}

	@Override
	public void command(String dName) {
		departments.get(dName).selfAction();
	}

}
