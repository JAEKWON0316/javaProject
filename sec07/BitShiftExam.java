package sec07;

public class BitShiftExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	int v1 = 10;
	 	int v2 = ~v1;
	 	int v3 = ~v1 + 1;
	 	System.out.println(toBinaryString(v1) + "(������ "+v1+")");
	 	System.out.println(toBinaryString(v2) + "(������ "+v2+")");
	 	System.out.println(toBinaryString(v3) + "(������ "+v3+")");
	}
	
	public static String toBinaryString(int num) {  //�ڹٿ��� �޼ҵ�(�Լ�)����¹� = public static �Ű������޴����� �޼ҵ��̸�()
			
		 String str = Integer.toBinaryString(num); //int������ ���� num�� String���� �ٲ��ش�.(������ 2�� ���ڿ��� ��ȯ���ִ� �޼ҵ�)
		 while(str.length() < 32) {
			 str = "0" + str;
		 }
		 return str;
	}
}
