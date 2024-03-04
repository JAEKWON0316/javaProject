package ch08.sec03;

public interface RemoteControl {
	//인터페이스에서 필드는 public 상수값만 갖을 수 있다.
	//인터페이스 내에서는 필드에 값을 선언하면 그것이 곧 상수이다. 이래서 인터페이스는 규격화하는거임
	int MAX_VOLUME = 10; //선언하고 값만 써줘도 상수다. 인터페이스는 변경하는 값을 만들지 못하고 구현할 수 있는 기능은 없으니 
	                     //static(클래스 이름으로 바로 출력시킬 수 있는것, 클래스에 붙는것) final이 된다.
	int MIN_VOLUME = 0;
	
	//인터페이스 내에서 정의되는 메소드는 모두 추상 메소드이다.
	public void turnOn(); //인터페이스의 기본 메소드는 추상메소드
	public void turnOff();
	void setVolume(int volume);
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교홥합니다.");
	}
}
