package guava.collections;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TestTable {

	/**
	 * ������֧���������͵ļ������С��͡��С���Table�ṩ������ͼ
	 */
	@Test
	public void test(){
		Table<Integer, Integer, String> table  = HashBasedTable.create();
		table.put(1, 1, "3");
		table.put(1, 2, "4");
		table.put(1, 3, "5");
		table.put(2, 2, "6");
		System.out.println(table.row(1).get(1));
		System.out.println(table.column(2).get(2));
	}
}
