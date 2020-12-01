package dp.behavior.iterator;

/**
 * 迭代器接口
 *
 * @author fengb
 * @date 2020年12月1日 下午3:08:24
 */
public interface MyIterator {

	boolean hasNext();

	Object next();

	void reset();
}
