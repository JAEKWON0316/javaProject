package sec3;

public class StringConCatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ���
		int res1 = 10 + 2 + 8; //int ������ 20
		System.out.println(res1);
		
		//���� ����
		String res2 = 10 + 2 + "8";  //���ڿ� 128 ������ �������� ���������� �������� ������ ù ���� 2���� ��������.
		System.out.println(res2);    //��, ���ڿ��� ������ �� �ڷκ��� ���ڿ��� �� ����.
		
		int resInt = Integer.parseInt(res2); //128���ڿ��� ������ 128�� �޾Ƽ� ������ ����
		int resRes = res1 + resInt; // ������ 20 + ������ 128
		System.out.println(resRes); //������ 148 ���!!
		String resString = String.valueOf(resRes); //������ 148�� ���ڿ��� ��ȯ�ؼ� �������� ����
		System.out.println(resString); //���ڿ� 148 ���!!
		System.out.println(resString.getClass().getName()); //���ڿ� Ÿ��Ȯ��
		
		
		
		String res3 = 10 + "2" + 8;  //���ڿ� 1028
		System.out.println(res3);
		
		String res4 = "10" + 2 + 8; //���ڿ� 1028  2+8 10 ���� �ȳ��´� ��? �տ� �̹� ���ڿ��� �޾ұ� ������.
		System.out.println(res4);
		
		String res5 = "10" + (2 + 8); //���ڿ� 1010
		System.out.println(res5);
	}

}
