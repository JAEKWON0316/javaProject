package sec10;

public class TelevisionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//info�� ����Ͻÿ�.
		System.out.println(Television.info); //��������� �ٷ� ȣ�Ⱑ��
		//static �޼ҵ� ���
		Television.method2();
		
		//instance �޼ҵ� ���
		Television tv = new Television(); //Television ��ü�� �����ؼ� �������� ��.
		
		System.out.println(tv.pay); //�����ʵ����
		
		tv.method1(50000000);
	}

}
