package sec02;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = (int) (Math.random()*6) + 1;
			
			System.out.println("��ǻ�Ͱ� ������ �ֻ����� ���� �˾Ƹ��� ������.");
			int userNum = sc.nextInt();
			if(num == userNum) {
				System.out.println("�����Դϴ�.");
				break;
			}
			//System.out.println(num);
		}
		System.out.println("���α׷� ����");
		sc.close();
	}

}
