package guava.collections;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

public class TestMulti {

	/**
	 *û��Ԫ��˳�����Ƶ�ArrayList<E>
     *Map<E, Integer>����ΪԪ�أ�ֵΪ����
	 */
	@Test
	public void testMultiset(){		
		Multiset<String> set  = HashMultiset.create();
		set.add("231");
		set.add("441");
		set.add("231");
		set.entrySet().forEach(key->{
			System.out.println("key:"+key.getElement() +"count:"+key.getCount());
		});
	}
	
	/**
	 * ���� Map<K,Collection<V> S>
	 */
	@Test
	public void testMultiMap(){
		Multimap<String, String> map  = ArrayListMultimap.create();
		String b  = "b";
		map.put("a", b);
		map.put("a", "c");
		map.put("a", "d");
		map.put("a", b);
		map.remove("a",b);
		System.out.println(map.get("b").size());
	}
	
}
