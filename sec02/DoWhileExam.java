package sec02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� ���� �Ϸ��� q�� �Է� �ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}
		while( !inputString.equals("q"));  //while�� ���� = (inputString�� q�� �ƴϸ�) q�� �ȴ����� true�ϱ� �ݺ�
		System.out.println("���α׷� ����");
	}

}
