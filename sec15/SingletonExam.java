package sec15;

public class SingletonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton ton1 = new Singleton(); //�ʵ尡 private�̱� ������ �ܺο��� ��üȭ �� �� ��� ������
		//Singleton ton2 = new Singleton();
		
		//�����޼ҵ带 ȣ���ؼ� �̱��� ��ü�� ����
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1 == obj2);
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		}
		else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}

}
