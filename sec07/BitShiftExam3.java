package sec07;

public class BitShiftExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 정수 772를 2진수로 표기하라.
//		2. 우측으로 3Byte(24bit) 이동 마지막 1바이트만 읽음
//		3. 우측으로 2Byte 이동 마지막 1바이트만 읽음
//		4. 우측으로 1Byte 이동 마지막 1바이트만 읽음
//		5. 마지막 1Byte를 읽어라.
		
	    //1.
		int num1 = 772;
		System.out.println(toBinaryString(num1) + "(십진수 "+num1+")");
		//2.
		int num2 = num1 >>> 24;
		System.out.println(toBinaryString(num2) + "(십진수 "+num2+")");
		
		//3.
		int num3 = num1 >>> 16;
		System.out.println(toBinaryString(num3) + "(십진수 "+num3+")");
		//4.
		int num4 = num1 >>> 8;
		System.out.println(toBinaryString(num4) + "(십진수 "+num4+")");
		//5.
		byte num5 = (byte) num1;
		System.out.println(toBinaryString(num5) + "(십진수 "+num5+")");
	}
	public static String toBinaryString(int num) {  //자바에서 메소드(함수)만드는법 = public static 매개변수받는형식 메소드이름()
		
		 String str = Integer.toBinaryString(num); //int형으로 받은 num을 String으로 바꿔준다.(정수를 2진 문자열로 변환해주는 메소드)
		 while(str.length() < 32) {
			 str = "0" + str;
		 }
		 return str;
	}
}


