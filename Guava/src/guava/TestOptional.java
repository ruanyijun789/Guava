package guava;
import com.google.common.base.Optional;

public class TestOptional {

	public static void main(String[] args) {
		Optional<String> a  = Optional.fromNullable(null);
		Optional<Integer>  b  =  Optional.fromNullable(2);
		//asSet
		System.out.println(b.asSet().size());
		//or
		System.out.println(a.or("")+b.or(0));
		//get
		try {
			System.out.println(a.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//isPresent
		System.out.println(a.isPresent());
		System.out.println(b.isPresent());
	}
}
