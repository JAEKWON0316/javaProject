package exam02;


public class MethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		System.out.println("현재속도 :"+myCar.getSpeed()+"km/h");
	}

}
