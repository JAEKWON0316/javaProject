package Exam01;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("�ֻ��� ���� ���纸����!!");
		int check = sc.nextInt();
		int dice = (int) (Math.random() * 6) + 1;
		*/
		
		while(true) {    //������ scope�ȿ����� �� �� �ֱ� ������ whild���� �ȿ� ������ �ٽ� ���������Ѵ�.
			System.out.println("�ֻ��� ���� ���纸����!!");
			int dice = (int) (Math.random() * 6) + 1;
			int check = sc.nextInt();
			if(check == dice) {
				System.out.println("����~ �ֻ������� " + check + " �Դϴ�!" );
				break;
			}
			System.out.println("��~ �ֻ������� " + dice + " �����ϴ�!");
			
		}
		
		/*
		if (check == dice) {
			System.out.println("����~ �ֻ������� " + check + " �Դϴ�!" );
		}
		else {
		System.out.println("��~ �ֻ������� " + dice + " �����ϴ�!");
			
		}
		*/
	
 }

}
