package sec04.lesson01;

public class Computer extends Calculator{
	
	@Override
	public double areaCircle(double r){ //�������̵� �θ�ü�� �ִ°� �ڽİ�ü�� ������ ���°�
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
	
}
