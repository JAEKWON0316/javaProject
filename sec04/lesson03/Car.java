package sec04.lesson03;

public class Car {
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() {
		speed += 1;
	}
	
	//�ڵ��� ����
	public final void stop() {
		System.out.println("�ڵ����� ������ŵ�ϴ�.");
		speed = 0;
	}
}
