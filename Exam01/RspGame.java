package Exam01;

import java.util.Scanner;

public class RspGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* java�� �̿��Ͽ� ����, ����, �� ������ ����� ������.
		 * 1. (int)(Math.random() * 3) 0 �ƴϸ� 1 �ƴϸ� 2
		 * 2. Scanner�� �̿��ؼ� ����ڰ� �� ���� ���� ���� ����.
		 * 3. if���� �̿��ؼ� ����,����,���� ������ �ٲ�
		 * 4. ��ǻ�� ���� ����� ���ڸ� �� (if�� �̿�) 
		 */
		
		Scanner sc = new Scanner(System.in);
//		String a = "����";
//		String b = "����";
//		String c = "��";
		System.out.println("����~ ����~ ��~");
		String user = sc.nextLine();
		int userInt = 0;
		if (user.equals("����")) {
			userInt = 0;
			
		}
		else if(user.equals("����")) {
			userInt = 1;
			
		}
		else if(user.equals("��")) {
			userInt = 2;
			
		}
		else {
			System.out.println("�ٽ� �Է����ּ���!");
		}
		int cpu = (int) (Math.random() * 3);
		
		if( cpu == 0 && userInt == 1) {
			System.out.println("��:����, ��:����, �̰���ϴ�.");
		}
		else if( cpu == 0 && userInt == 2) {
			System.out.println("��:��, ��:����, �����ϴ�.");
		}
		else if( cpu == 1 && userInt == 0) {
			System.out.println("��:����, ��:����, �����ϴ�.");		
		}
		else if( cpu == 1 && userInt == 2) {
			System.out.println("��:��, ��:����, �̰���ϴ�.");
		}
		else if( cpu == 2 && userInt == 0) {
			System.out.println("��:����, ��:��, �̰���ϴ�.");
		}
		else if( cpu == 2 && userInt == 1) {
			System.out.println("��:����, ��:��, �����ϴ�.");
		}
		else {
			System.out.println("�����ϴ�");
		}
		
		
		
		
		
	}

}
