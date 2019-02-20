package guava.basicutilities;

import com.google.common.base.Preconditions;

public class TestPreconditions {

	public static void main(String[] args) {
		int i = 2;
		//�жϲ���
		Preconditions.checkArgument(i==2, "������ %s", i);
		//�пղ���
		Preconditions.checkNotNull(i);
		//�����������ĳЩ״̬
		Preconditions.checkState(true);		
		//���index��Ϊ����ֵ��ĳ���б��ַ����������Ƿ���Ч��index>=0 && index<size *
		Preconditions.checkElementIndex(2, 5);
		//���index��Ϊλ��ֵ��ĳ���б��ַ����������Ƿ���Ч��index>=0 && index<=size *
		Preconditions.checkPositionIndex(5, 5);
		//���[start, end]��ʾ��λ�÷�Χ��ĳ���б��ַ����������Ƿ���Ч*
		Preconditions.checkPositionIndexes(1, 3, 4);		
	}
}
