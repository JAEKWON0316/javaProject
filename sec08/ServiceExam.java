package ch08.sec08;

public class ServiceExam {

	public static void main(String[] args) {
		
		//정적메소드
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
		System.out.println();
		
		Service se = new ServiceImpl(); //이렇게 해줘야 defaultMethod까지 호출할 수 있음.
		
		//default
		se.defaultMethod1();
		System.out.println();
		se.defaultMethod2();
		System.out.println();

	}

}
