package ch07.sec10;

public class PhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Phone phone = new Phone(); phone은 추상클래스이기떄문에 객체를 만들 수 없다.
		SmartPhone smartPhone = new SmartPhone("홍길동"); //그래서 자식타입을 이용해 객체를 만든다.
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
