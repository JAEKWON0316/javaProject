package ch07.sec10;

public abstract class Animal {
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언(부모 추상 클래스에선 메소드를 선언만 한다. 실체화는 자식클래스에서
	public abstract void sound();
		
	
}
