package sec02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료 하려면 q를 입력 하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}
		while( !inputString.equals("q"));  //while문 조건 = (inputString이 q가 아니면) q를 안누르면 true니까 반복
		System.out.println("프로그램 종료");
	}

}
