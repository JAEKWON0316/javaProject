package sec06;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 문자 A를 변수 charCode에 담아 CharCode가 65보가 크거나 같으면
		//	 "charCode는 대문자 입니다."를 출력하라.
		//char charCode = 'A'; //둘다 가능
		int charCode = 'A';
		if ((charCode >= 65) && (charCode <= 90)) {     //A는 65이기 때문에 charCode는 대문자입니다. 이게 나온다!
			System.out.println("charCode는 대문자 입니다.");
		}
		else {
			System.out.println("charCode는 대문자가 아닙니다.");
		}
		
		//2. charCode가 97 과 122 사이에 있으면 charCode는 소문자 입니다. 그렇지 않으면
		//   소문자가 아닙니다.를 출력하라.
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("charCode는 소문자 입니다.");
		}
		else {
			System.out.println("charCode는 소문자가 아닙니다.");
		}
		
		//3. charCode가 48 과 57 사이에 있으면 charCode는 숫자 입니다. 그렇지 않으면
		//   숫자가 아닙니다.를 출력하라.
		if ((charCode >= 48) && (charCode <=57)) {
			System.out.println("charCode는 숫자입니다.");
		}
		else {
			System.out.println("charCode는 숫자가 아닙니다.");
		}
	}

}
