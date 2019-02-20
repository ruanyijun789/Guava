package guava.collections;

import org.junit.Test;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class TestBiMap {

	@Test
	public void testBiMap(){
		BiMap<String, String>  bimap  =  HashBiMap.create();
		bimap.put("4", "7");
		bimap.put("1", "2");
		System.out.println(bimap.inverse().get("7"));
	}
}
