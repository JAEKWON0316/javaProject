package sec06.exam02;

import sec06.exam01.A;

public class D extends A {
	//생성자 선언
	public D() {
		//A 생성자 호출
		super(); //부모 생성자 호출
	}
	
	//메소드 선언
	public void method1() { //다른 이름으로 선언해줘야 부모메소드를 오버라이딩 하지않고 D의 생성자를 이용하여 자기 메소드를 호출한다
		//A필드 변경
		this.field = "value"; //상속받았으니 this로 부모필드를 호출가능
		
		//A 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {
		/*
		 * 상속을 받았어도 protected 접근제한자가 있는 클래스를 직접 객체로 만들어 사용 할 수는 없다.
		 */
		//A a = new A(); //이렇게 A를 객체화 해서 사용하는건 불가능. 즉, 같은 패키지에서는 객체화해서 사용가능하지만 다른패키지에서는 this로 받아와서 사용
	}
}
