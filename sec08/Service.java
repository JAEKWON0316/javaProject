package ch08.sec08;

public interface Service {
      //default
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
		staticCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
		staticCommon();
	}
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defalutMethod 중복 코드A");
		System.out.println("defalutMethod 중복 코드B");
	}
	
	//정적메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
		//defaultCommon(); //정적메소드는 클래스에 붙어있는거고 defaultCommon()은 private이기 때문에 바로 못불러온다 객체생성 후 해줘야함.
		
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복코드 C");
		System.out.println("staticMethod 중복코드 D");
	}
}
