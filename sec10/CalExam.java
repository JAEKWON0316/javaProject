package sec10;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 10 * 10 * Calculator.pi; //pi�� Ŭ������ �Ҽӵ� static����̱� ������ new�� ��üȭ�� ���ϰ� �ٷ� ȣ���� �� �ִ�.
		System.out.println("�������� 10�� ���� �������� " + result + "�Դϴ�.");
		
		//10 + 5�� 10 - 5�� ����غ��� plus �޼ҵ�� minus �޼ҵ�
		int rs1 = Calculator.plus(10 ,5);
		System.out.println("10 + 5 �� ����� : " + rs1);
		int rs2 = Calculator.minus(10 ,5);
		System.out.println("10 - 5 �� ����� : " + rs2);
		
		
		//10 * 5�� ����غ��� multiply �޼ҵ� ���
		Calculator cal = new Calculator(); //instance����� ȣ���ϱ� ���� ��üȭ
		int rs3 = cal.multiply(10, 5);
		//int rs3 = Calculator.multiply(10, 5); -> �̰Ŵ� ������ multiply�� ��������� �ƴ� �ν��Ͻ�����̱� ������ new�� ��üȭ�� ���༭ ȣ��������Ѵ�.
		System.out.println("10 * 5 �� ����� : " + rs3);
	}

}
