package ch07.exam07;

public class SnowTireExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowTire = new SnowTire();
		 Tire tire = snowTire; //�θ� Ÿ������ �ڵ� Ÿ�Ժ�ȯ ->�θ� Ŭ������ ����� �ʵ�� �޼ҵ常 ������ �����ϴ�
		                       //�׷���, �ڽ� Ŭ�������� �������̵��� �޼ҵ尡 �ִٸ� �θ� �޼ҵ� ��� �������̵��� �޼ҵ尡 ȣ��ȴ�. �̴� [ ������ ] �� �����ִ�.
		 snowTire.run(); //�������̵��� run�޼ҵ����
		 tire.run(); //�������̵��� run�޼ҵ����
	}

}
