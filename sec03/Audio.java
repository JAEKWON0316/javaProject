package ch08.sec03;

public class Audio implements RemoteControl {
    //필드
	private int volume;
	private int defaultVolume; //지금 설정돼있는 기본값 볼륨
	@Override
	public void turnOn() {
		
		System.out.println("오디오를 듣습니다.");
	}

	@Override
	public void turnOff() {
		
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
	   if(volume > RemoteControl.MAX_VOLUME) {
		   this.volume = RemoteControl.MAX_VOLUME;
	   }
	   else if(volume < RemoteControl.MIN_VOLUME) {
		   this.volume = RemoteControl.MIN_VOLUME;
	   }
	   else {
		   this.volume = volume;
	   }
	   System.out.println("현재 오디오의 볼륨 : " + volume);
		
	}
	//디폴트메소드의 재정의시에는 반드시 public 으로 해야 하며 default는 생략한다.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.defaultVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");
			setVolume(this.defaultVolume); //mute 해제될 경우 원래의 볼륨값으로 돌아감.
		}
	}

}
