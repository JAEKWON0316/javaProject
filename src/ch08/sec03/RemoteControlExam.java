package ch08.sec03;

public class RemoteControlExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ִ뺼���� : " + RemoteControl.MAX_VOLUME + "�Դϴ�.");
		System.out.println("�ּҺ����� : " + RemoteControl.MIN_VOLUME + "�Դϴ�.");
		RemoteControl cc; //�������̽� Ÿ��(�θ�Ÿ��)���� ���� ���� ����
		cc = new Television(); // �θ�� �ڵ�Ÿ�Ժ�ȯ �������̽��� ���� �θ�Ÿ������ �ڽİ�ü ����
		cc.turnOn(); //�ڽĸ޼ҵ忡�� �������̵� �� �� ��� -> �θ�Ÿ���� �����Ű���� super.turnOn(); �ؾ���.
		
		cc = new Audio();
		cc.turnOn();
	}

}
