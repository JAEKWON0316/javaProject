package sec02;

public class SwitchChar01Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("����� ȸ�� �Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("����� ȸ�� �Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}
	}
   /*
    * switch(grade) {  //java 12���ʹ� �Ʒ��� ���� ������ �� �ִ�.
    * case 'A', 'a' -> {
    * 
    * }
    * case 'B', 'b' -> {
    * 
    * }
    */
}
