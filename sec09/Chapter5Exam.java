package sec09;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter5Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length); //��ü �迭�� ����3��
		System.out.println(array[2].length);//3��° �迭�� ���� �ȿ� 5��
		
		//7. 
		int[] array2 = {1, 5, 3, 8, 2};
		int x = 0;
		for(int i = 1; i < array2.length; i++) {
			if(array2[i] > array2[i-1]) {
				x = array2[i];
			}
		}
		int max = 0;
		for(int i = 0; i < array2.length; i++) {
			if(max < array2[i]) {
				max = array2[i];
			}
		}
		System.out.println("�ִ밪�� : " + x);
		System.out.println("�ִ밪�� : " + max);
		
		//8.
		int[][] array3 = {
				{95, 83},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int stu = 0;
		for(int i = 0; i < array3.length; i++) {
			stu += array[i].length;
			for(int j = 0; j < array3[i].length; j++) {
				sum += array3[i][j];
			}
		}
		System.out.println(sum);
		double avg = (double) sum / stu;
		System.out.println(avg);
		
		//9.
		Scanner sc = new Scanner(System.in);
		//System.out.println("�л� ���� �Է����ּ���:");
		//int snum = sc.nextInt();
		//System.out.println("������ �Է����ּ���:");
		//int score = sc.nextInt();
		boolean test = true;
		int[] scores = null;
		int studentNumber = 0;
		while(test) {
			
			System.out.println("--------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------------");
			System.out.print("����> ");
			String check = sc.nextLine();
			int checkInt = Integer.parseInt(check);
			
			switch(checkInt){
				case 1:
					System.out.println("�л���> ");
					//num = new int[] {sc.nextInt()};
					studentNumber = Integer.parseInt(sc.nextLine());
					//studentNumber = sc.nextInt();
					scores = new int[studentNumber]; //�л�����ŭ�� ���� �迭�� ����� ���´�.
					break;
				case 2:
					for(int i = 0 ; i < scores.length; i++) {
						System.out.println("�����Է�> ");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
					break;
				case 3:
					for(int i=  0; i < scores.length; i++) {
						System.out.print(scores[i] + ",");
					}
					System.out.println("�Էµ� ���� :" + Arrays.toString(scores)); //�迭���� String���� �� ���� �ѷ��ִ� �Լ�
					
					break;
				case 4:
					int max2 = 0;
					int sum2 = 0;
					double avg2 = 0.0;
					for(int i = 0; i < scores.length; i++) {
						max2 = (max2 < scores[i]) ? scores[i] : max2;
						sum2 += scores[i];
					}
					avg2 = (double) sum2 / studentNumber;
					System.out.println("�ְ� ���� : " + max2 + "��");
					System.out.println("��� ���� : " + avg2 + "��");
					break;
					
				case 5:
					test = false;
					
				default:
					test = false;
			}
			
		}
		System.out.println("**************************");
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		System.out.println("**************************");
		
	}

}
