package ch08.sec03;

public class Television implements RemoteControl{ //인터페이스를 상속할땐 implements를 써준다.(extends 대신)
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
