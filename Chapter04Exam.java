package sec02;

import java.util.Scanner;

public class Chapter04Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2번문제 (Expresstion 표현식으로 switch문을 바꾸기) 이거 다음버전부터 됨.
		/*String grade = "B";
		int score = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		}*/
		
		
		
		//3번문제
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
	
			}
			
		}
		System.out.println(sum);
		//4번문제
		
		boolean test = true;
		while(test) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("눈1: " + dice1 + " 눈2: " + dice2 + " 합계는: " + (dice1 + dice2) );
			if(dice1 + dice2 == 5) {
				test=false; //변수로 안해주고 그냥 true로 while문을 돌렸다면 break; 해주면된다.
				
			}
		}
		
		//5번문제
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
					sum2 = (4 * i) + (5 * j);
					if(sum2 == 60) {
						System.out.println("(" + i + "," + j + ")");
					}
			}
		}
		
		//6번문제
		for(int i = 1;i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		//7번문제
		Scanner sc = new Scanner(System.in);
		boolean test2 = true;
		int total = 0;
		while(test2) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("--------------------------------------");
			//String check = sc.nextLine();
			//int checkInt = Integer.parseInt(check);  //String(문자열)타입을 integer(정수형)타입으로 변경
			int check = sc.nextInt();
			switch(check) {
				case 1:
					System.out.println("얼마를 예금 하시겠습니까?");
					int x = sc.nextInt();
					total += x;
					System.out.println("예금액>+" + x + "원 잔고는>"+ total);					
					break;
				case 2:
					System.out.println("얼마를 출금 하시겠습니까?");
					int y = sc.nextInt();
					total -= y;
					if(total < 0) {
						System.out.println("잔고가 없습니다 ㅠㅠ 텅장");
						test2 = false;
					}
					else {
						System.out.println("출금액>-" + y + "원 잔고는" + total);
					}
					break;
				case 3:
					System.out.println("잔고>"+ total);
					break;
				case 4:
					test2 = false;
					System.out.println("프로그램 종료");
					
						
			}
			
			
		}
	}

}
