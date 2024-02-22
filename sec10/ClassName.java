package sec10;

public class ClassName {
	//인스턴스 멤버	
	int field1;
	void method1() {
		
	}
	
	//정적멤버
	static int field2;
	static void method2() {
		
	}
	
	//정적블록
	static {
		//field1 = 10; 컴파일 에러(정적블록에서 인스턴스 멤버를 사용하려해서)
		//method1(); 컴파일 에러(정적블록에서 인스턴스 멤버를 사용하려해서)
		field2 = 10;
		method2();
	}
	
	//정적메소드
	static void method3() {
		//this.field = 10; //this를 사용할 수 없다(this는 인스턴스 멤버를 불러 올 때 사용하는것)
		//this.method1(); //this를 사용할 수 없다(this는 인스턴스 멤버를 불러 올 때 사용하는것)
		field2 = 10;
		method2();
	}
}
