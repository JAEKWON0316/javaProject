package sec02;

public class SmartPhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü�� ����
		SmartPhone myPhone = new SmartPhone("������", "��ũ���"); //SmartPhone�� ��üȭ �ص� SmartPhone�� Phone�� ����߱� ������ Phone�� �ڵ����� ��üȭ�ȴ�.
		
		//Phone���� ���� ��ӹ��� �ʵ带 �б�
		System.out.println("�� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);
		
		//SmartPhone �ʵ�
		System.out.println("�������� ���� : " + myPhone.wifi); //wifi�ʱ�ȭ�� �������� �⺻�� false�� ���´�.
		
		//Phone���� ���� ��� ���� �޼ҵ� ȣ��
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�ȳ��ϼ���? ���� ���� ��ǰ�� �־� ��ȭ��Ⱦ��.");
		myPhone.sendVoice("���� ���� �ٻ���. �����.");
		myPhone.hangUp();
		
		//SmartPhone �޼ҵ� ȣ��
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
