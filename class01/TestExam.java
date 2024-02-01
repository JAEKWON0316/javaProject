package class01;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. v1 + v2 출력
//		2. v1 + v2 - v4 출력
//		3. v1 / v2 출력
//		4. v1 % v2 출력
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
	//  1.	
		int r1 = v1 + v2;
		System.out.println("v1 + v2 =" + r1);
		
	//  2.
		long r2 = v1 + v2 - v4;
		System.out.println("v1 + v2 - v2 =" + r2);
		
	//  3.
		double r3 = (double) v1 / v2; //대입해주는거에서 먼저 강제타입변환으로 실수형(double)로 만들어야 2.5로 정확한 실수로 들어옴.
		System.out.println("v1 / v2 =" + r3);  //그래서 하나를 실수형으로 정해줘서 result = 15.0 / 20 이렇게 해주면 강제 타입변환 하지 않고 대입 해줄 수 있음.
	
		
	//  4.
		int r4 = v1 % v2;
		System.out.println("v1 % v2 =" + r4);
		
	}

}
