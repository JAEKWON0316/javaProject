package sec02;

import java.util.Scanner;

public class RpsExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean game = true;
		do {
			int computerChoice = (int) (Math.random() * 3);
			System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���:");
			String userChoice = sc.nextLine();
			
			//�Է°� ����(����, ����, �� �̿��� ���ڸ� ���� ������ ����Ѵ�.
			if(!userChoice.equals("����") && !userChoice.equals("����") && !userChoice.equals("��")) {
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
		
		switch(computerChoice){
			case 0: //��ǻ�� ����
				if(userChoice.equals("����")) {
					System.out.println("�̰���ϴ�.");
					game = false;
				}
				else if(userChoice.equals("��")) {
					System.out.println("�����ϴ�.");
					game = false;
				}
				else {
					System.out.println("�����ϴ�.");

				}
				break;
			case 1: //��ǻ�� ����
				if(userChoice.equals("����")) {
					System.out.println("�����ϴ�.");
					game =false;
				}
				else if(userChoice.equals("����")) {
					System.out.println("�����ϴ�.");
				}
				else {
					System.out.println("�̰���ϴ�.");
					game =false;
				}
				break;
			case 2:
				if(userChoice.equals("����")) {
					System.out.println("�̰���ϴ�.");
					game =false;
				}
				else if(userChoice.equals("����")) {
					System.out.println("�����ϴ�.");
					game =false;
				}
				else {
					System.out.println("�����ϴ�");
				}
				break;
				
		}
		}
		while(game);
		System.out.println("������ ���� �մϴ�.");
		sc.close();
	}

}
