package Exam01;
import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * scanner로 점수를 받은 후 받은 점수가 A, B, C, D, F 인지 확인하라.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요!");
		int score = sc.nextInt();
		
		if(score > 90) {
			System.out.println("점수가 90점이 넘어요. A학점 입니다.");
		}
		else if(score <= 90 && score > 80){
			System.out.println("점수가 80점이 넘어요. B학점 입니다.");
		}
		else if(score <= 80 && score > 70){
			System.out.println("점수가 70점이 넘어요. C학점 입니다.");
		}
		else if(score <= 70 && score > 60){
			System.out.println("점수가 60점이 넘어요. D학점 입니다.");
		}
		else {
			System.out.println("점수가 60도 안돼요. F학점 입니다.");
		}
	}

}
