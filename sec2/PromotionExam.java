package sec2;

public class PromotionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue ='고';
		intValue = charValue;
		System.out.println("고의 유니코드는" + intValue + "입니다");
		
		long longValue = intValue;
		System.out.println(longValue);
		
		double doubleValue = longValue;
		System.out.println(doubleValue);
		
		float floatValue = longValue;
		System.out.println(floatValue);
			
	}

}
