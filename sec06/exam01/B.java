package sec06.exam01;

public class B {
	/*
	 * ���������� protected�� ���� ��Ű�� �������� public, default�� ���� �����Ӱ� ��� �����ϴ�.
	 */
	
	//�޼ҵ� ����
	public void method() { 
	A a = new A(); //���� ��Ű�� �ʿ��� protected�� ��밡��
	a.field = "value";
	a.method();
	}
}

