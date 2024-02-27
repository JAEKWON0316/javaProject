package sec06.exam03;

class A{
	//필드
	String fieldA;
	//메소드
	void methodA() {
		System.out.println("A메소드 출력");
	}
}

class B extends A {
	//필드
	String fieldB;
	//메소드
	@Override
	void methodA() {
		System.out.println("A메소드를 오버라이드 해서 출력");
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
		A b = new B(); //B의 부모인 A 타입으로 자동타입변환 객체생성 가능
		b.fieldA = "valueA";
		b.methodA();
		/* 부모타입으로 자동타입변환이 되면 부모클래스의 필드 메소드는 접근가능하지만
		 * 변수가 자식객체를 참조하더라도 변수로 접근 가능한 멤버는 오직 부모 클래스이다.
		 * 자기필드와 메소드 사용불가, 하지만 부모것을 오버라이드한 메소드라면 출력가능!!(다형성)
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
		
//		B b2 = e; //상속 관계가 아니니 타입변환 불가능
//		C c2 = d; //상속 관계가 아니니 타입변환 불가능
	}

}

