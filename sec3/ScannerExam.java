package sec3;

import java.util.Scanner;  //�ڹ� scanner ���̺귯�� ��������

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� x�� ���� �Է��ϼ���. ");
		String strX = sc.nextLine(); //scanner�� nextLine()���� �޾��ش�.
		
		System.out.println("���� y�� ���� �Է��ϼ���. ");
		String strY = sc.nextLine();
		
		int x = Integer.parseInt(strX); //scanner�� ���ڿ��� �޴°��̱� ������ int������ �ٲ��ֱ�
		int y = Integer.parseInt(strY);
		int result = x + y;
		System.out.println("x + y =" + result);
		System.out.println("+++++++++++++Ten End +++++++++++++");
	}

}
