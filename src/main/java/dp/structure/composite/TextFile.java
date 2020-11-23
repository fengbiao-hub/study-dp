package dp.structure.composite;

/**
 * 组合模式-叶子节点
 *
 * @author fengb
 * @date 2020年11月23日 下午3:15:43
 */
public class TextFile implements AbstactFile {

	private String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("对文本文件【" + name + "】进行查杀");
	}

}
