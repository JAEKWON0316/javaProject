package sec02;

import java.util.Scanner;

public class RpsExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user;
		String cpu;
		int userInt = 0;
		boolean game = true;
		
		do {
			System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���:");
			user = sc.nextLine();
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
				continue;  //do���� ó������ �ٽ� ����
			}
			int com = (int) (Math.random() * 3);
			if (com == 0) {
				cpu = "����";
				
			}
			else if(com == 1) {
				cpu = "����";
				
			}
			else{
				cpu = "��";
				
			}
			if((userInt == 0 && com == 2) || (userInt == 1 && com == 0) || (userInt == 2 && com ==1)){
				System.out.println("��: " + user + " ��ǻ��: " + cpu + " ���� �̰���ϴ�.");	
				game = false;
				}
			else if((userInt == 0 && com == 1) || (userInt == 1 && com == 2) || (userInt == 2 && com == 0)) {
				System.out.println("��: " + user + " ��ǻ��: " + cpu + " ���� �����ϴ�.");
				game = false;
			}
			else {
				System.out.println("��: " + user + " ��ǻ��: " + cpu + " �����ϴ�.");
				
			}
		}
		while(game); 
			System.out.println("���α׷� ����");
		
		
	}

}
