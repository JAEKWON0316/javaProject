package sec05;

public class SplitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,�ڹ� �н�,���� Ÿ�� String�� �����մϴ�.,��ö��";
		//��ǥ�� �������� ���ڿ� �и�
		String[] tks = board.split(","); //split�� �迭 Ÿ������ �����Ѵ�
		String str = "��ȣ : ,���� : ,���� : ,�̸� : ";
		String[] arr = str.split(",");
		//�ε����� �о����
		System.out.println("��ȣ : " + tks[0]);
		System.out.println("���� : " + tks[1]);
		System.out.println("���� : " + tks[2]);
		System.out.println("�̸� : " + tks[3]);
		System.out.println("++++++++++++++++");
		System.out.println();
		
		for(int i = 0; i < tks.length; i ++) { 
			//�迭�� ���̴� length; , ���ڿ��� ���̴� length();
			System.out.print(arr[i]);
			System.out.println(tks[i]);
		}
	}

}
