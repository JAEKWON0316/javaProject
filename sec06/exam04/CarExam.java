package sec06.exam04;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car 객체 선언
		Car myCar = new Car();
		
		//누구를 객체로 만들지에 따라서(객체의 다형성) 여러가지를 구현할 수 있다.
		
		//Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//한국Tire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//금호Tire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}	

}
