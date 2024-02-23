package sec04.exam02;

public class KF21Airplane extends Airplane {
	//상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//상태선언 필드
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}
		else {
			//부모클래스 Airplane의 method fly() 호출해서 사용
			super.fly();
		}
		
	}
}
