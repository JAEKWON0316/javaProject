package sec02;

public class SmartPhone extends Phone{
	//�ʵ�
	public boolean wifi;
	//������
	public SmartPhone(String model, String color) { //�θ� �ʵ忡 �ִ°��� �ڽ�Ŭ�������� �ʱ�ȭ
		//super(); //�θ������ ȣ���ϴ� �۾� �������� �θ� �����ڿ� �ƹ��͵� ������
		super(model, color); //�θ� ������ ���� ȣ�� �׸��� �θ�����ڿ��� �ʱ�ȭ ���������� �ٽ� ���� �ʿ䰡����.
		//this.model = model;
		//this.color = color;
		System.out.println("SmartPhone(String model, String color) �����ڰ� ���� ��");
		System.out.println("�ڽ� ������ ����");
	}
	//�޼ҵ�
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("���������� ���¸� �����߽��ϴ�.");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� ���� �մϴ�.");
	}
}
