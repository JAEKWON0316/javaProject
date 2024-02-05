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
			System.out.println("가위, 바위, 보 중 하나를 입력하세요:");
			user = sc.nextLine();
			if (user.equals("가위")) {
				userInt = 0;
				
			}
			else if(user.equals("바위")) {
				userInt = 1;
				
			}
			else if(user.equals("보")) {
				userInt = 2;
				
			}
			else {
				System.out.println("다시 입력해주세요!");
				continue;  //do문의 처음부터 다시 실행
			}
			int com = (int) (Math.random() * 3);
			if (com == 0) {
				cpu = "가위";
				
			}
			else if(com == 1) {
				cpu = "바위";
				
			}
			else{
				cpu = "보";
				
			}
			if((userInt == 0 && com == 2) || (userInt == 1 && com == 0) || (userInt == 2 && com ==1)){
				System.out.println("나: " + user + " 컴퓨터: " + cpu + " 내가 이겼습니다.");	
				game = false;
				}
			else if((userInt == 0 && com == 1) || (userInt == 1 && com == 2) || (userInt == 2 && com == 0)) {
				System.out.println("나: " + user + " 컴퓨터: " + cpu + " 내가 졌습니다.");
				game = false;
			}
			else {
				System.out.println("나: " + user + " 컴퓨터: " + cpu + " 비겼습니다.");
				
			}
		}
		while(game); 
			System.out.println("프로그램 종료");
		
		
	}

}
