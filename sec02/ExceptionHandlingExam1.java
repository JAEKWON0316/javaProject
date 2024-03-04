package ch11.sec02;

public class ExceptionHandlingExam1 {
    
	//�޼ҵ�
	public static void printLength(String data) {
		try {
		int rs = data.length(); //���ڿ��� ���̴� ()�� �����Ѵ�.
		//�迭�� ���̴� data.length;
		System.out.println("������ �� : " + rs);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		finally {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printLength("�ڹ��� ����ó��"); //printLength()�޼ҵ忡 {�ڹ��� ����ó��} �� 8������ ���ڿ��� ������
        System.out.println();
        printLength(null);
        //System.out.println("���α׷��� ����Ǿ����ϴ�."); //���̰� �־�� �ϴµ� null���� �־����� ���࿡��
	}

}
