package guava.basicutilities;

import com.google.common.base.Preconditions;

public class TestPreconditions {

	public static void main(String[] args) {
		int i = 2;
		//判断参数
		Preconditions.checkArgument(i==2, "错误了 %s", i);
		//判空操作
		Preconditions.checkNotNull(i);
		//用来检查对象的某些状态
		Preconditions.checkState(true);		
		//检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size *
		Preconditions.checkElementIndex(2, 5);
		//检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size *
		Preconditions.checkPositionIndex(5, 5);
		//检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效*
		Preconditions.checkPositionIndexes(1, 3, 4);		
	}
}
