package sec06;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ���� A�� ���� charCode�� ��� CharCode�� 65���� ũ�ų� ������
		//	 "charCode�� �빮�� �Դϴ�."�� ����϶�.
		//char charCode = 'A'; //�Ѵ� ����
		int charCode = 'A';
		if ((charCode >= 65) && (charCode <= 90)) {     //A�� 65�̱� ������ charCode�� �빮���Դϴ�. �̰� ���´�!
			System.out.println("charCode�� �빮�� �Դϴ�.");
		}
		else {
			System.out.println("charCode�� �빮�ڰ� �ƴմϴ�.");
		}
		
		//2. charCode�� 97 �� 122 ���̿� ������ charCode�� �ҹ��� �Դϴ�. �׷��� ������
		//   �ҹ��ڰ� �ƴմϴ�.�� ����϶�.
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("charCode�� �ҹ��� �Դϴ�.");
		}
		else {
			System.out.println("charCode�� �ҹ��ڰ� �ƴմϴ�.");
		}
		
		//3. charCode�� 48 �� 57 ���̿� ������ charCode�� ���� �Դϴ�. �׷��� ������
		//   ���ڰ� �ƴմϴ�.�� ����϶�.
		if ((charCode >= 48) && (charCode <=57)) {
			System.out.println("charCode�� �����Դϴ�.");
		}
		else {
			System.out.println("charCode�� ���ڰ� �ƴմϴ�.");
		}
	}

}
