package sec02;

import java.util.Scanner;

public class Chapter04Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2������ (Expresstion ǥ�������� switch���� �ٲٱ�) �̰� ������������ ��.
		/*String grade = "B";
		int score = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		}*/
		
		
		
		//3������
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
	
			}
			
		}
		System.out.println(sum);
		//4������
		
		boolean test = true;
		while(test) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("��1: " + dice1 + " ��2: " + dice2 + " �հ��: " + (dice1 + dice2) );
			if(dice1 + dice2 == 5) {
				test=false; //������ �����ְ� �׳� true�� while���� ���ȴٸ� break; ���ָ�ȴ�.
				
			}
		}
		
		//5������
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
					sum2 = (4 * i) + (5 * j);
					if(sum2 == 60) {
						System.out.println("(" + i + "," + j + ")");
					}
			}
		}
		
		//6������
		for(int i = 1;i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		//7������
		Scanner sc = new Scanner(System.in);
		boolean test2 = true;
		int total = 0;
		while(test2) {
			System.out.println("--------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ�Ȯ�� | 4.����");
			System.out.println("--------------------------------------");
			//String check = sc.nextLine();
			//int checkInt = Integer.parseInt(check);  //String(���ڿ�)Ÿ���� integer(������)Ÿ������ ����
			int check = sc.nextInt();
			switch(check) {
				case 1:
					System.out.println("�󸶸� ���� �Ͻðڽ��ϱ�?");
					int x = sc.nextInt();
					total += x;
					System.out.println("���ݾ�>+" + x + "�� �ܰ��>"+ total);					
					break;
				case 2:
					System.out.println("�󸶸� ��� �Ͻðڽ��ϱ�?");
					int y = sc.nextInt();
					total -= y;
					if(total < 0) {
						System.out.println("�ܰ� �����ϴ� �Ф� ����");
						test2 = false;
					}
					else {
						System.out.println("��ݾ�>-" + y + "�� �ܰ��" + total);
					}
					break;
				case 3:
					System.out.println("�ܰ�>"+ total);
					break;
				case 4:
					test2 = false;
					System.out.println("���α׷� ����");
					
						
			}
			
			
		}
	}

}
