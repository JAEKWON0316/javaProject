package ch11.sec02;

public class ExceptionHandlingExam3 {
 
	
	public static void main(String[] args) {
		
	   String[] array = {"123", "loo"}; //자바에서 배열은 중괄호로 묶어준다.
	   
	   for(int i = 0; i <= array.length; i++) {
		   
		   try {
			   int value = Integer.parseInt(array[i]);
			   System.out.println("array[" + i + "] : " + value);
		   }
		   catch(ArrayIndexOutOfBoundsException e){ //배열 인덱스 범위가 배열 길이 초과시 에러
			   System.out.println("배열 인덱스 초과됨 : " + e.getMessage());
		   }
		   catch(NumberFormatException e) {
			   System.out.println("숫자로 변환 불가능 : " + e.getMessage()); //이거 먼저 예외처리가 됨. 즉 , 순서에 따라 처리를 해줌.
		   }
	   }
	}

}
