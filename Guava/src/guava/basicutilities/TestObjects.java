package guava.basicutilities;

import org.junit.Test;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;


public class TestObjects {

	@Test
	public void testEquals(){
		System.out.println(Objects.equal("3", null));		
	}
	@Test
	public void testCompare(){
		Person p   = new Person(2, "中国");
		Person p1 =  new Person(2, "中国4试试") ; 
	     System.out.println(p.compareTo(p1));
	}
	
	
	public  class Person implements Comparable<Person>{
		private Integer num;
		private String name;
		
		public Integer getNum() {
			return num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}              
		public Person(Integer num,String name){
			this.num = num;
			this.name =  name;
		}
		@Override
		public int compareTo(Person o) {
			return ComparisonChain.start().compare(this.num, o.getNum()).
					compare(this.name, o.getName()).result();
		}
		
		
	}
}
