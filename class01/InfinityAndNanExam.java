package class01;
import java.util.Scanner; //��ĳ�� �ޱ����� �ڹ� ���̺귯�� ����Ʈ

public class InfinityAndNanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 5;
		//double y = 0.0;
		//double z = x / y;
		//System.out.println(z);
		//System.out.println(z + 1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("x���� ���ڸ� �Է��ϼ���."); 
		//String strX = sc.nextLine();    ==>��Ʈ�� Ÿ������ �޾Ƽ� int������ ��ȯ�ϴ¹�
		// int x = Integer.parseInt(strX); 
		int x = sc.nextInt(); //Scanner���� �ٷ� Int�� �޴¹�.
		System.out.println("y���� ���ڸ� �Է��ϼ���.");
		double y = sc.nextDouble();
		
		double z = x / y;

		//����ó��                                                                                 
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("���� ����� �� ����.");
		}
		else {
			System.out.println(z + 2);
		}
		sc.close();
	}
}