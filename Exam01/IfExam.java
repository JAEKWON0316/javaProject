package Exam01;
import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * scanner�� ������ ���� �� ���� ������ A, B, C, D, F ���� Ȯ���϶�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���!");
		int score = sc.nextInt();
		
		if(score > 90) {
			System.out.println("������ 90���� �Ѿ��. A���� �Դϴ�.");
		}
		else if(score <= 90 && score > 80){
			System.out.println("������ 80���� �Ѿ��. B���� �Դϴ�.");
		}
		else if(score <= 80 && score > 70){
			System.out.println("������ 70���� �Ѿ��. C���� �Դϴ�.");
		}
		else if(score <= 70 && score > 60){
			System.out.println("������ 60���� �Ѿ��. D���� �Դϴ�.");
		}
		else {
			System.out.println("������ 60�� �ȵſ�. F���� �Դϴ�.");
		}
	}

}
