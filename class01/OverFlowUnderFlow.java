package class01;

public class OverFlowUnderFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte num = 127;
		num++;
		System.out.println(num);
		
		byte num2 = -128;
		num2--;
		System.out.println(num2);
		
		byte var1 = 125;
		for(int i = 0; i < 5; i++){
			var1++;
			System.out.println("var1 : " + var1);
		}
		System.out.println("----------------");
		
		byte var2 = -125;
		for(int i = 0; i < 5; i++) { //������ �ȿ����� ������ �ۿ������� ���� for���� i�� �ٸ� i�̴�!!
			var2--;
			System.out.println("var2 : " + var2);
		}
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);  //���� �÷ο찡 �߻��ؼ� �̻��� ���� ���´�.
		
		long z1 = (long) x * y;
		System.out.println(z1); //Ÿ�� ��ȯ�� ��Ȯ�� ���༭ �����÷ο�, ����÷ο찡 ������ �ʵ��� �ؾ��Ѵ�.
		
	}

}
