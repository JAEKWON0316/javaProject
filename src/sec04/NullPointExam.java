package sec04;

public class NullPointExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = null;
		//num[0] = 20;   -> NullPointerException �߻�
		
		//String str = null;
		//System.out.println("�� ������ ����" + str.length() + "�Դϴ�."); -> NullPointerException �߻�
		String str = "ȫ�浿";
		str = "��ö��";
		str = null; //�̷��� �Ǹ� str�� ������ �ּҸ� �ؾ������ ��.
		
	}

}
