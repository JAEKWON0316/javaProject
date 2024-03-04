package ch08.sec08;

public interface Service {
      //default
	default void defaultMethod1() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();
		staticCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 ���� �ڵ�");
		defaultCommon();
		staticCommon();
	}
	
	//private �޼ҵ�
	private void defaultCommon() {
		System.out.println("defalutMethod �ߺ� �ڵ�A");
		System.out.println("defalutMethod �ߺ� �ڵ�B");
	}
	
	//�����޼ҵ�
	static void staticMethod1() {
		System.out.println("staticMethod1 ���� �ڵ�");
		staticCommon();
		//defaultCommon(); //�����޼ҵ�� Ŭ������ �پ��ִ°Ű� defaultCommon()�� private�̱� ������ �ٷ� ���ҷ��´� ��ü���� �� �������.
		
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 ���� �ڵ�");
		staticCommon();
	}
	
	//private ���� �޼ҵ�
	private static void staticCommon() {
		System.out.println("staticMethod �ߺ��ڵ� C");
		System.out.println("staticMethod �ߺ��ڵ� D");
	}
}
