package sec3;

public class ValScopeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1 > 10) { //�ڹٴ� �������ȿ����� ������ ����.
			int v2 = v1 - 10; //v2������
		} // --------������� �ۿ� ������.---------
		//int v3 = v1 + v2 + 5; //v2������ ���� ������ �ۿ� �ֱ� ������ v2������ ����� �� ��� ������ ����.
	  System.out.println("1�� �ؽ�Ʈ"); //����ó��(�ٹٲ�)
	  System.out.println("2�� �ؽ�Ʈ");
	  
	  System.out.printf("�̸� : %s", "ȫ �浿 \r");
	  System.out.printf("���� : %d \r", 25);
	  
	  System.out.printf("�̸� : %s ���� :%d", "ȫ �浿", 25);
	}
}
