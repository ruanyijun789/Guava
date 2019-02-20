package guava.collections;

import org.junit.Test;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class TestClassToInstanceMap {

	@Test
	public void test(){
		ClassToInstanceMap<Number> map =  MutableClassToInstanceMap.create();
		map.putInstance(Integer.class, 233);
		map.putInstance(Double.class, 232.22D);
		System.out.println(map.getInstance(Double.class));
	}
}
