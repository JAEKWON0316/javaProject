package ch11.sec02;

public class ExceptionHandlingExam3 {
 
	
	public static void main(String[] args) {
		
	   String[] array = {"123", "loo"}; //�ڹٿ��� �迭�� �߰�ȣ�� �����ش�.
	   
	   for(int i = 0; i <= array.length; i++) {
		   
		   try {
			   int value = Integer.parseInt(array[i]);
			   System.out.println("array[" + i + "] : " + value);
		   }
		   catch(ArrayIndexOutOfBoundsException e){ //�迭 �ε��� ������ �迭 ���� �ʰ��� ����
			   System.out.println("�迭 �ε��� �ʰ��� : " + e.getMessage());
		   }
		   catch(NumberFormatException e) {
			   System.out.println("���ڷ� ��ȯ �Ұ��� : " + e.getMessage()); //�̰� ���� ����ó���� ��. �� , ������ ���� ó���� ����.
		   }
	   }
	}

}
