package sec08;

public class MsaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("�Ű������� ���� �����ϰų� �����ϴ�.");
			System.exit(0); //���α׷� ��������
		}
		String snum1 = args[0];
		String snum2 = args[1];
		
		int num1 = Integer.parseInt(snum1); //StringŸ���� IntegerŸ������ ��ȯ
		int num2 = Integer.parseInt(snum2);
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}

}