package dp.structure.composite.test;

import dp.structure.composite.AbstactFile;
import dp.structure.composite.Folder;
import dp.structure.composite.TextFile;
import dp.structure.composite.VideoFile;

/**
 * 测试组合模式
 *
 * @author fengb
 * @date 2020年11月23日 下午3:14:49
 */
public class TestComposite {

	public static void main(String[] args) {
		Folder f1 = new Folder("我的下载");
		AbstactFile f2 = new TextFile("毕业设计.docs");
		AbstactFile f3 = new VideoFile("超智能足球.av");
		Folder f4 = new Folder("我的音乐");
		AbstactFile f5 = new VideoFile("向全世界宣布爱你.mp3");
		AbstactFile f6 = new VideoFile("隐身守护.mp3");
		f4.add(f5);
		f4.add(f6);
		f1.add(f2);
		f1.add(f3);
		f1.add(f4);
		f1.killVirus();
	}
}
