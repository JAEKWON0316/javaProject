package sec04;

import java.util.Scanner;

public class CharAtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("������ϰ� �ֹε�Ϲ�ȣ ù ° �ڸ��� -���� �Է��ϼ���.");
		String number = sc.nextLine();
		if(number.length() == 7) {
			char last = number.charAt(6); //1�ڸ��� �޾ƿ��°Ŵϱ�
			switch(last) {
			case '1' : case '3' :
				System.out.println("����� �����Դϴ�.");
				break;
			case '2' : case '4' :
				System.out.println("����� �����Դϴ�.");
				break;
			}
			break;
		}
		else {
			System.out.println("�ֹε�Ϲ�ȣ�� 7�ڸ� ���� �Է��ϼ���!");
		}
	
		}
		System.out.println("=============��============");
	}

}
