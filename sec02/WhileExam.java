package sec02;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		while(i < 10) {
			System.out.println("********** " + i + "�� **********");
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
			}
			j = 1; //j�� �ٽ� 1�� �������� while(j < 10)���� ������ ���� ������ �ʱ�ȭ ��������Ѵ�!
			i++;
		}
	}

}
