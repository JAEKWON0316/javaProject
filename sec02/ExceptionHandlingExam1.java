package ch11.sec02;

public class ExceptionHandlingExam1 {
    
	//메소드
	public static void printLength(String data) {
		try {
		int rs = data.length(); //문자열의 길이는 ()가 들어가야한다.
		//배열의 길이는 data.length;
		System.out.println("문자의 수 : " + rs);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램이 종료되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printLength("자바의 예외처리"); //printLength()메소드에 {자바의 예외처리} 총 8길이의 문자열을 넣은것
        System.out.println();
        printLength(null);
        //System.out.println("프로그램이 종료되었습니다."); //길이가 있어야 하는데 null값을 넣었으니 실행에러
	}

}
