package sec10;

public class ClassName {
	//�ν��Ͻ� ���	
	int field1;
	void method1() {
		
	}
	
	//�������
	static int field2;
	static void method2() {
		
	}
	
	//�������
	static {
		//field1 = 10; ������ ����(������Ͽ��� �ν��Ͻ� ����� ����Ϸ��ؼ�)
		//method1(); ������ ����(������Ͽ��� �ν��Ͻ� ����� ����Ϸ��ؼ�)
		field2 = 10;
		method2();
	}
	
	//�����޼ҵ�
	static void method3() {
		//this.field = 10; //this�� ����� �� ����(this�� �ν��Ͻ� ����� �ҷ� �� �� ����ϴ°�)
		//this.method1(); //this�� ����� �� ����(this�� �ν��Ͻ� ����� �ҷ� �� �� ����ϴ°�)
		field2 = 10;
		method2();
	}
}
