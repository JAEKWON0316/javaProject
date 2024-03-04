package ch08.sec03;

public interface RemoteControl {
	//�������̽����� �ʵ�� public ������� ���� �� �ִ�.
	//�������̽� �������� �ʵ忡 ���� �����ϸ� �װ��� �� ����̴�. �̷��� �������̽��� �԰�ȭ�ϴ°���
	int MAX_VOLUME = 10; //�����ϰ� ���� ���൵ �����. �������̽��� �����ϴ� ���� ������ ���ϰ� ������ �� �ִ� ����� ������ 
	                     //static(Ŭ���� �̸����� �ٷ� ��½�ų �� �ִ°�, Ŭ������ �ٴ°�) final�� �ȴ�.
	int MIN_VOLUME = 0;
	
	//�������̽� ������ ���ǵǴ� �޼ҵ�� ��� �߻� �޼ҵ��̴�.
	public void turnOn(); //�������̽��� �⺻ �޼ҵ�� �߻�޼ҵ�
	public void turnOff();
	void setVolume(int volume);
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ���d�մϴ�.");
	}
}
