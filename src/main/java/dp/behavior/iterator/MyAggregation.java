package dp.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式-聚合对象
 *
 * @author fengb
 * @date 2020年12月1日 下午3:19:09
 */
public class MyAggregation {

	private List<Object> objs = new ArrayList<Object>();

	public void addObj(Object obj) {
		objs.add(obj);
	}

	public void removeObj(Object obj) {
		objs.remove(obj);
	}

	public List<Object> getObjs() {
		return objs;
	}

	public void setObjs(List<Object> objs) {
		this.objs = objs;
	}

	public MyIterator createIterator() {
		return new MyIteratorImpl();
	}

	/**
	 * 迭代器实现
	 *
	 * @author fengb
	 * @date 2020年12月1日 下午3:18:53
	 */
	private class MyIteratorImpl implements MyIterator {

		private int cursor = -1;

		@Override
		public boolean hasNext() {
			return cursor < (objs.size() - 1);
		}

		@Override
		public Object next() {
			return objs.get(++cursor);
		}

		@Override
		public void reset() {
			cursor = -1;
		}

	}
}
