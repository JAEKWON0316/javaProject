package sec06.exam01;

public class B {
	/*
	 * 접근제한자 protected는 같은 패키지 내에서는 public, default와 같이 자유롭게 사용 가능하다.
	 */
	
	//메소드 선언
	public void method() { 
	A a = new A(); //같은 패키지 않에서 protected는 사용가능
	a.field = "value";
	a.method();
	}
}

