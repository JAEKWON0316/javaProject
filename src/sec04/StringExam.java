package sec04;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "ȫ�浿"; //�������� ȫ�浿 �ּһ���
		String name2 = "ȫ�浿";//�������� �ִ� ȫ�浿 �ּҿ� ����
		
		String name3 = new String("ȫ�浿"); //��ü�� �����ؼ� �������� �ٸ� �ּҿ� ����
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		 
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name2 == name3);
		
		System.out.println(name1.equals(name3)); //�׷��� String�� ���� ������ ������ equals��ü�� ����Ѵ�.
		
	}

}
