package Exam01;

import java.util.Scanner;

public class RspGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* java를 이용하여 가위, 바위, 보 게임을 만들어 보세요.
		 * 1. (int)(Math.random() * 3) 0 아니면 1 아니면 2
		 * 2. Scanner를 이용해서 사용자가 낼 가위 바위 보를 정함.
		 * 3. if문을 이용해서 가위,바위,보를 정수로 바꿈
		 * 4. 컴퓨터 숫자 사용자 숫자를 비교 (if문 이용) 
		 */
		
		Scanner sc = new Scanner(System.in);
//		String a = "가위";
//		String b = "바위";
//		String c = "보";
		System.out.println("가위~ 바위~ 보~");
		String user = sc.nextLine();
		int userInt = 0;
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
		}
		int cpu = (int) (Math.random() * 3);
		
		if( cpu == 0 && userInt == 1) {
			System.out.println("나:바위, 컴:가위, 이겼습니다.");
		}
		else if( cpu == 0 && userInt == 2) {
			System.out.println("나:보, 컴:가위, 졌습니다.");
		}
		else if( cpu == 1 && userInt == 0) {
			System.out.println("나:가위, 컴:바위, 졌습니다.");		
		}
		else if( cpu == 1 && userInt == 2) {
			System.out.println("나:보, 컴:바위, 이겼습니다.");
		}
		else if( cpu == 2 && userInt == 0) {
			System.out.println("나:가위, 컴:보, 이겼습니다.");
		}
		else if( cpu == 2 && userInt == 1) {
			System.out.println("나:바위, 컴:보, 졌습니다.");
		}
		else {
			System.out.println("비겼습니다");
		}
		
		
		
		
		
	}

}
