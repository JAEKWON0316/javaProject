package ch07.exam07;

public class Example {
		public static void action(A a) {
			 a.method1();
			 if(a instanceof C) { //���� a�� ��ü�� C�� Ÿ���̶��
				 C c = (C) a; //a�� C�� ����Ÿ�Ժ�ȯ
			     c.method2();
			 } 
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 action(new A());
		 action(new B());
		 action(new C());
	}

}
