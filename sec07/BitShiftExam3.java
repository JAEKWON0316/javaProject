package sec07;

public class BitShiftExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. ���� 772�� 2������ ǥ���϶�.
//		2. �������� 3Byte(24bit) �̵� ������ 1����Ʈ�� ����
//		3. �������� 2Byte �̵� ������ 1����Ʈ�� ����
//		4. �������� 1Byte �̵� ������ 1����Ʈ�� ����
//		5. ������ 1Byte�� �о��.
		
	    //1.
		int num1 = 772;
		System.out.println(toBinaryString(num1) + "(������ "+num1+")");
		//2.
		int num2 = num1 >>> 24;
		System.out.println(toBinaryString(num2) + "(������ "+num2+")");
		
		//3.
		int num3 = num1 >>> 16;
		System.out.println(toBinaryString(num3) + "(������ "+num3+")");
		//4.
		int num4 = num1 >>> 8;
		System.out.println(toBinaryString(num4) + "(������ "+num4+")");
		//5.
		byte num5 = (byte) num1;
		System.out.println(toBinaryString(num5) + "(������ "+num5+")");
	}
	public static String toBinaryString(int num) {  //�ڹٿ��� �޼ҵ�(�Լ�)����¹� = public static �Ű������޴����� �޼ҵ��̸�()
		
		 String str = Integer.toBinaryString(num); //int������ ���� num�� String���� �ٲ��ش�.(������ 2�� ���ڿ��� ��ȯ���ִ� �޼ҵ�)
		 while(str.length() < 32) {
			 str = "0" + str;
		 }
		 return str;
	}
}


