package sec2;

public class Casting2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteVal1 = 10;
		byte byteVal2 = 20;
		//byte rs = byteVal1 + byteVal2; // 컴파일 에러
		int rs = byteVal1 + byteVal2;
		System.out.println(rs);
		
		char charVal1 = 'A';
		char charVal2 = 1;
		
		//char charVal3 = charVal1 + charVal2; //컴파일 에러
		int charVal3 = charVal1 + charVal2;
		System.out.println("유니코드는" + charVal3);
		System.out.println("출력 문자는 " + (char) charVal3);
		
		int intVal3 = 10;
		int intVal4 = 4;
		int intVal5 = intVal3 / intVal4;
		System.out.println(intVal5);
		
		double doubleVal = (double) intVal3 / intVal4;
		System.out.println(doubleVal); 
	}

}
