package sec06.exam03;

class A{
	//�ʵ�
	String fieldA;
	//�޼ҵ�
	void methodA() {
		System.out.println("A�޼ҵ� ���");
	}
}

class B extends A {
	//�ʵ�
	String fieldB;
	//�޼ҵ�
	@Override
	void methodA() {
		System.out.println("A�޼ҵ带 �������̵� �ؼ� ���");
	}
	void methodB() {
		
	}
}

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}

public class PromotionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b = new B();
		A b = new B(); //B�� �θ��� A Ÿ������ �ڵ�Ÿ�Ժ�ȯ ��ü���� ����
		b.fieldA = "valueA";
		b.methodA();
		/* �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� �Ǹ� �θ�Ŭ������ �ʵ� �޼ҵ�� ���ٰ���������
		 * ������ �ڽİ�ü�� �����ϴ��� ������ ���� ������ ����� ���� �θ� Ŭ�����̴�.
		 * �ڱ��ʵ�� �޼ҵ� ���Ұ�, ������ �θ���� �������̵��� �޼ҵ��� ��°���!!(������)
		b.fieldB = "valueB";
		b.methodB();
		*/
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e; //��� ���谡 �ƴϴ� Ÿ�Ժ�ȯ �Ұ���
//		C c2 = d; //��� ���谡 �ƴϴ� Ÿ�Ժ�ȯ �Ұ���
	}

}

