package class01;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. v1 + v2 ���
//		2. v1 + v2 - v4 ���
//		3. v1 / v2 ���
//		4. v1 % v2 ���
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
	//  1.	
		int r1 = v1 + v2;
		System.out.println("v1 + v2 =" + r1);
		
	//  2.
		long r2 = v1 + v2 - v4;
		System.out.println("v1 + v2 - v2 =" + r2);
		
	//  3.
		double r3 = (double) v1 / v2; //�������ִ°ſ��� ���� ����Ÿ�Ժ�ȯ���� �Ǽ���(double)�� ������ 2.5�� ��Ȯ�� �Ǽ��� ����.
		System.out.println("v1 / v2 =" + r3);  //�׷��� �ϳ��� �Ǽ������� �����༭ result = 15.0 / 20 �̷��� ���ָ� ���� Ÿ�Ժ�ȯ ���� �ʰ� ���� ���� �� ����.
	
		
	//  4.
		int r4 = v1 % v2;
		System.out.println("v1 % v2 =" + r4);
		
	}

}
