package ch07.exam07;

public class SnowTireExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowTire = new SnowTire();
		 Tire tire = snowTire; //부모 타입으로 자동 타입변환 ->부모 클래스에 선언된 필드와 메소드만 접근이 가능하다
		                       //그러나, 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다. 이는 [ 다형성 ] 과 관련있다.
		 snowTire.run(); //오버라이딩된 run메소드실행
		 tire.run(); //오버라이딩된 run메소드실행
	}

}
