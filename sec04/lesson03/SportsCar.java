package sec04.lesson03;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10; //Car�� �ʵ带 ������Ŵ
	}
	
//	@Override
//	public void stop() { //�θ𿡼� stop() �޼ҵ带 final�� ���߱� ������ override �ȵȴ�!!.
//		System.out.println("������ī�� ���� ��ŵ�ϴ�."); 
//	}
	
}
