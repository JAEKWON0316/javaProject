package ch11.sec02;

public class ExceptionHandlingExam2 {
     
	public static void main(String[] args) {
		 
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		}
		catch(ClassNotFoundException e) {
		    e.printStackTrace();	
		}//finally는 생략가능
		   System.out.println();	
		   
		try {
		    Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
			}
        //catch(ClassNotFoundException e) {
		  catch(Exception e) { //이렇게 써줘도 문제없다.
			    e.printStackTrace();	
			}//finally는 생략가능
			   System.out.println();		
		
	}
}
