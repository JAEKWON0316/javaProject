package sec10;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 10 * 10 * Calculator.pi; //pi는 클래스에 소속된 static멤버이기 때문에 new로 객체화를 안하고 바로 호출할 수 있다.
		System.out.println("반지름이 10인 원의 원주율은 " + result + "입니다.");
		
		//10 + 5와 10 - 5를 출력해보자 plus 메소드와 minus 메소드
		int rs1 = Calculator.plus(10 ,5);
		System.out.println("10 + 5 의 결과는 : " + rs1);
		int rs2 = Calculator.minus(10 ,5);
		System.out.println("10 - 5 의 결과는 : " + rs2);
		
		
		//10 * 5도 출력해보자 multiply 메소드 출력
		Calculator cal = new Calculator(); //instance멤버를 호출하기 위한 객체화
		int rs3 = cal.multiply(10, 5);
		//int rs3 = Calculator.multiply(10, 5); -> 이거는 오류남 multiply는 정적멤버가 아닌 인스턴스멤버이기 때문에 new로 객체화를 해줘서 호출해줘야한다.
		System.out.println("10 * 5 의 결과는 : " + rs3);
	}

}
