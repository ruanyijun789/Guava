package guava.basicutilities;

import org.junit.Test;

import com.google.common.base.Throwables;

public  class TestThorwException {
	
	public void throwRuntimeException(){
		throw  new RuntimeException();
	}
	public void throwNullPointerException(){
		throw new NullPointerException();
	}

	@Test
	public void test(){
		TestThorwException   t  = new TestThorwException();
		try {
			t.throwRuntimeException();
		} catch (Exception  e) {
			Throwables.throwIfInstanceOf(e, NullPointerException.class);
		}
		System.out.println("2333");
	}
}
