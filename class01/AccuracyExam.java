package class01;

public class AccuracyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����� 1�ִ�. �� ����� 10�������� ������.
		 * �� ������ 0.1
		 * 7������ �԰� ���� ������ �� �ΰ�?
		 * 0.3
		 */
		int apple = 1;
		double onePeace = 0.1;
		int number = 7;
		
		double resultApple = apple - number * onePeace;
		System.out.println("��� �Ѱ����� ���� ���� : " + resultApple +"�Դϴ�"); //�ٻ�ġ 0.29999999......���´�
		
		//��Ȯ�� ����� �ϴ¹�(���������� ��ȯ �� ����)
		int totalPeace = apple * 10;
		int resultApple2 = totalPeace - number;
		System.out.println("��� 10���� �߿� ���� ������ : " + resultApple2);
		System.out.println("��� �� ���� ���� ���� : " + resultApple2 / 10.0); //���� �� �Ǽ����� �ְų� �Ǽ������� �����ָ� �Ǽ������� ���´�.
	}

}
