package sec08;

public class MsaExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 4) {
			System.out.println("�Ű������� ���ų� �����ϴ�!");
			System.exit(0);
		}
		
		String snum1 = args[0];
		String snum2 = args[1];
		String snum3 = args[2];
		String snum4 = args[3];
		//snum1 = "15";
		//snum2 = "64";
		//snum3 = "133";
		//snum4 = "15135";
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		int num3 = Integer.parseInt(snum3);
		int num4 = Integer.parseInt(snum4);
		int sum = num1 + num2 + num3 + num4;
		double avg = (double) sum / args.length;
		System.out.println("�� �� ���� ������ : " + sum);
		System.out.println("�� �� ���� ����� : " + avg);
	}

}
