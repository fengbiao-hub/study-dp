package dp.behavior.iterator.test;

import dp.behavior.iterator.MyAggregation;
import dp.behavior.iterator.MyIterator;

/**
 * 迭代器模式-测试迭代器模式
 *
 * @author fengb
 * @date 2020年12月1日 下午3:24:45
 */
public class TestIterator {

	public static void main(String[] args) {
		MyAggregation aggregation = new MyAggregation();
		aggregation.addObj("fengb");
		aggregation.addObj("zhangcy");
		aggregation.addObj("guoj");
		MyIterator iterator = aggregation.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
