package sec04.exam02;

public class AirplaneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KF21Airplane kf = new KF21Airplane();
		
		kf.takeOff();
		kf.fly();
		kf.flyMode = KF21Airplane.SUPERSONIC; //kf.flyMode = kf.SUPERSONIC;
		kf.fly();
		kf.flyMode = KF21Airplane.NORMAL;
		kf.fly();
		kf.land();
		
	}

}
