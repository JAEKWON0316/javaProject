package ch11.sec02;

public class ExceptionHandlingExam2 {
     
	public static void main(String[] args) {
		 
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String Ŭ������ �����մϴ�.");
		}
		catch(ClassNotFoundException e) {
		    e.printStackTrace();	
		}//finally�� ��������
		   System.out.println();	
		   
		try {
		    Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 Ŭ������ �����մϴ�.");
			}
        //catch(ClassNotFoundException e) {
		  catch(Exception e) { //�̷��� ���൵ ��������.
			    e.printStackTrace();	
			}//finally�� ��������
			   System.out.println();		
		
	}
}
