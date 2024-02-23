package sec02;

public class SmartPhone extends Phone{
	//필드
	public boolean wifi;
	//생성자
	public SmartPhone(String model, String color) { //부모 필드에 있는것을 자식클래스에서 초기화
		//super(); //부모생성자 호출하는 작업 생략가능 부모 생성자에 아무것도 없을시
		super(model, color); //부모 생성자 먼저 호출 그리고 부모생성자에서 초기화 해줬음으로 다시 해줄 필요가없다.
		//this.model = model;
		//this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자가 실행 됨");
		System.out.println("자식 생성자 실행");
	}
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이의 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결 합니다.");
	}
}
