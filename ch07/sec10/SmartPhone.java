package ch07.sec10;

public class SmartPhone extends Phone {
	//������
	SmartPhone(String owner){
		super(owner); //�θ� �̹� �ʱ�ȭ �ϰ� �־ super�θ� �����ڷ� �ʱ�ȭ �ؾ���
	}
		//�޼ҵ�
	void internetSearch() {
		System.out.println("���ͳ��� �˻��մϴ�.");
	}
}
