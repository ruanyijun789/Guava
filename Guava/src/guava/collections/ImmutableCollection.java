package guava.collections;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * ���Բ��ɱ伯��
 * @author ryj
 * @since  2018��7��25��
 */
public class ImmutableCollection {

	public  List<String> list  = ImmutableList.of("33","44","ks");
	
	public  List<String> list1  = ImmutableList.<String>builder().add("xss").build();
	
	@Test
	public void test(){
		list.forEach(e ->{System.out.println(e);});
	}
	
	
}
