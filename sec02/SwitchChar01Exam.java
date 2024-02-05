package sec02;

public class SwitchChar01Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수한 회원 입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("우수한 회원 입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}
   /*
    * switch(grade) {  //java 12부터는 아래와 같이 구성할 수 있다.
    * case 'A', 'a' -> {
    * 
    * }
    * case 'B', 'b' -> {
    * 
    * }
    */
}
