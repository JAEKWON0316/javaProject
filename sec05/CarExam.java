package sec05;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Car myCar = new Car(); //자동으로 만들어진 생성자 메소드로 호출한것.
		
		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
		
		//Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도는 : " + myCar.speed);
	}

}
