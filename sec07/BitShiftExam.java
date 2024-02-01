package sec07;

public class BitShiftExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	int v1 = 10;
	 	int v2 = ~v1;
	 	int v3 = ~v1 + 1;
	 	System.out.println(toBinaryString(v1) + "(십진수 "+v1+")");
	 	System.out.println(toBinaryString(v2) + "(십진수 "+v2+")");
	 	System.out.println(toBinaryString(v3) + "(십진수 "+v3+")");
	}
	
	public static String toBinaryString(int num) {  //자바에서 메소드(함수)만드는법 = public static 매개변수받는형식 메소드이름()
			
		 String str = Integer.toBinaryString(num); //int형으로 받은 num을 String으로 바꿔준다.(정수를 2진 문자열로 변환해주는 메소드)
		 while(str.length() < 32) {
			 str = "0" + str;
		 }
		 return str;
	}
}
