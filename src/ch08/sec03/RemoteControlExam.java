package ch08.sec03;

public class RemoteControlExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("최대볼륨은 : " + RemoteControl.MAX_VOLUME + "입니다.");
		System.out.println("최소볼륨은 : " + RemoteControl.MIN_VOLUME + "입니다.");
		RemoteControl cc; //인터페이스 타입(부모타입)으로 변수 선언 가능
		cc = new Television(); // 부모로 자동타입변환 인퍼테이스도 가능 부모타입으로 자식객체 생성
		cc.turnOn(); //자식메소드에서 오버라이딩 한 값 출력 -> 부모타입을 실행시키려면 super.turnOn(); 해야함.
		
		cc = new Audio();
		cc.turnOn();
	}

}
