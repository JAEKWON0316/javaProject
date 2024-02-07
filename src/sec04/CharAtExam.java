package sec04;

import java.util.Scanner;

public class CharAtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("생년월일과 주민등록번호 첫 째 자리를 -없이 입력하세요.");
		String number = sc.nextLine();
		if(number.length() == 7) {
			char last = number.charAt(6); //1자리를 받아오는거니까
			switch(last) {
			case '1' : case '3' :
				System.out.println("당신은 남자입니다.");
				break;
			case '2' : case '4' :
				System.out.println("당신은 여자입니다.");
				break;
			}
			break;
		}
		else {
			System.out.println("주민등록번호를 7자리 내로 입력하세요!");
		}
	
		}
		System.out.println("=============끝============");
	}

}
