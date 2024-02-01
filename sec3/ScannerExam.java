package sec3;

import java.util.Scanner;  //자바 scanner 라이브러리 가져오기

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변수 x의 값을 입력하세요. ");
		String strX = sc.nextLine(); //scanner로 nextLine()값을 받아준다.
		
		System.out.println("변수 y의 값을 입력하세요. ");
		String strY = sc.nextLine();
		
		int x = Integer.parseInt(strX); //scanner는 문자열로 받는것이기 때문에 int형으로 바꿔주기
		int y = Integer.parseInt(strY);
		int result = x + y;
		System.out.println("x + y =" + result);
		System.out.println("+++++++++++++Ten End +++++++++++++");
	}

}
