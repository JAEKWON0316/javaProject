package sec04.exam02;

public class KF21Airplane extends Airplane {
	//��� ����
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//���¼��� �ʵ�
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ������ �մϴ�.");
		}
		else {
			//�θ�Ŭ���� Airplane�� method fly() ȣ���ؼ� ���
			super.fly();
		}
		
	}
}
