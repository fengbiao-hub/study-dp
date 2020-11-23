package dp.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式-容器
 *
 * @author fengb
 * @date 2020年11月23日 下午3:15:31
 */
public class Folder implements AbstactFile {

	private String name;
	private List<AbstactFile> children = new ArrayList<>();

	public Folder(String name) {
		super();
		this.name = name;
	}

	public void add(AbstactFile file) {
		children.add(file);
	}

	public void remove(AbstactFile file) {
		children.remove(file);
	}

	public List<AbstactFile> getChildren() {
		return this.children;
	}

	@Override
	public void killVirus() {
		System.out.println("对文件夹【" + name + "】进行查杀");
		for (AbstactFile abstactFile : children) {
			abstactFile.killVirus();
		}
	}

}
