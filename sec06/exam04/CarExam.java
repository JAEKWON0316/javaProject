package sec06.exam04;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car ��ü ����
		Car myCar = new Car();
		
		//������ ��ü�� �������� ����(��ü�� ������) ���������� ������ �� �ִ�.
		
		//Tire ��ü ����
		myCar.tire = new Tire();
		myCar.run();
		
		//�ѱ�Tire ��ü ����
		myCar.tire = new HankookTire();
		myCar.run();
		
		//��ȣTire ��ü ����
		myCar.tire = new KumhoTire();
		myCar.run();
	}	

}
