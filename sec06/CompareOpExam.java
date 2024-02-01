package sec06;

public class CompareOpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		boolean rs1 = (num1 == num2);
		boolean rs2 = (num1 != num2);
		boolean rs3 = (num1 <= num2);
		System.out.println("rs1 :" + rs1);
		System.out.println("rs2 :" + rs2);
		System.out.println("rs3 :" + rs3);
		
		//char A 와 char B를 변수에 담아 A < B 인지 비교하시오.
		char c1 = 'A';
		char c2 = 'B';
		boolean rs4 = c1 < c2;    // 65 < 66
		System.out.println("rs4 :" + rs4);
		
		//1과 1.0을 변수에 담아 같은지 비교 하시오.
		int num3 = 1;
		double num4 = 1.0;
		boolean rs5 = (num3 == num4);
		System.out.println("rs5 :"  + rs5);
		
		//0.1f 0.1을 변수에 담아 같은지 비교 하시오. 만약 다르다면
		//타입을 맞추어 비교 하시오.
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean rs6 = (num5 == num6);
		boolean rs8 = (num5 == (float) num6);  //double형을 더 작은 float로 강제타입변환
		System.out.println("rs6 :" + rs6);
		System.out.println("rs8 :" + rs8); //강제타입변환 후 찍어보면 true(같다.)가 나온다
		
		//"자바" 와 'java'가 같은지 비교 하시오. 또 다른지도 비교 하시오.
		String str1 = "자바";
		String str2 = "java";
		boolean rs7 = (str1.equals(str2));
		boolean rs9 = (str1 == str2); //되지만 오류가 날 수 있다.
		boolean rs10 = (!str1.equals(str2));
		System.out.println("rs7 :" + rs7);
		System.out.println("rs9 :" + rs9);
		System.out.println("rs10 :" + rs10); //str1과 str2를 다르다를 했음으로 true!!
		
		String strVar1 = "홍길동"; 
		String strVar2 = "홍길동";
		String strVar3 = new String("홍길동");  //String 클래스 변수명 strVar3를 만들어서 (new로 만들어주는게 class) 홍길동을 넣어줌.
		//클래스를 new로 만들어줘서 변수에 값을 넣어주면 기본 주소값이랑 달라져서 equal연산을 해도 값이 다르다고 나온다!!
		boolean st1 = (strVar1 == strVar2);
		boolean st2 = (strVar1 == strVar3);
		boolean st3 = (strVar1.equals(strVar3));
		System.out.println("st1 : " + st1);
		System.out.println("st2 : " + st2);  //주소값이 달라서 false가 나온다
		System.out.println("st3 : " + st3);  //그래서 equals를 써줘서 문자열의 타입을 확인한다.
		
	}

}
