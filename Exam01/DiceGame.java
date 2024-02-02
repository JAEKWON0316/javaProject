package Exam01;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("주사위 수를 맞춰보세용!!");
		int check = sc.nextInt();
		int dice = (int) (Math.random() * 6) + 1;
		*/
		
		while(true) {    //변수는 scope안에서만 쓸 수 있기 떄문에 whild문에 안에 변수를 다시 만들어줘야한다.
			System.out.println("주사위 수를 맞춰보세용!!");
			int dice = (int) (Math.random() * 6) + 1;
			int check = sc.nextInt();
			if(check == dice) {
				System.out.println("정답~ 주사위수는 " + check + " 입니당!" );
				break;
			}
			System.out.println("땡~ 주사위수는 " + dice + " 였습니당!");
			
		}
		
		/*
		if (check == dice) {
			System.out.println("정답~ 주사위수는 " + check + " 입니당!" );
		}
		else {
		System.out.println("땡~ 주사위수는 " + dice + " 였습니당!");
			
		}
		*/
	
 }

}
