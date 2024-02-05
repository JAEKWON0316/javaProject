package sec02;

import java.util.Scanner;

public class KeyControlExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true; //기본값 변수
		int speed = 0;
		
		while(run) {
			System.out.println("-------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------");
			System.out.println("선택: ");
			
			String strNum = sc.nextLine();
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			}
			else if(strNum.equals("2")){
				speed--;
				System.out.println("현재 속도 : " + speed);
			}
			else if(strNum.equals("3")) {
				run = false; //true를 false로 바꿔줌으로 while문 밖으로 나오게 됨.
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
