package sec10;

public class Television {
	
	//instance 필드
	int pay = 20000000;
	String color;
	
	//static 필드
	static String company = "LG"; //정적필드는 일반적으로 바로 초기화를 한다.
	static String model = "OLED";
	static String info; //정적 블록을 선언하는 방법
	
	static { //정적 블록을 만드는 방법
	info = company + "-" + model;
	}
	
	void method1(int getpay) { //instance 메소드
		this.pay = getpay;
		this.color = "빨강";
		System.out.println(this.pay + ", " + this.color + info); //instance안에서 static호출은 아무것도 안써주고 직접 쓰는게 가능하다.
		 														 //인스턴스 멤버 안에서 정적 멤버는 사용할 수 있다.
	}
	
	static void method2() { //static 메소드
		System.out.println(info); //인스턴스 메소드는 객체가 생성되야만 쓸 수 있어서 정적메소드에서 인스턴스메소드는 호출못한다.
								  //정적 멤버안에서 인스턴스 멤버는 사용할 수 없다.
	}
}
