package ch07.exam07;

public class Example {
		public static void action(A a) {
			 a.method1();
			 if(a instanceof C) { //만약 a의 객체가 C의 타입이라면
				 C c = (C) a; //a를 C로 강제타입변환
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
