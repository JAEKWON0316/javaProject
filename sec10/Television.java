package sec10;

public class Television {
	
	//instance �ʵ�
	int pay = 20000000;
	String color;
	
	//static �ʵ�
	static String company = "LG"; //�����ʵ�� �Ϲ������� �ٷ� �ʱ�ȭ�� �Ѵ�.
	static String model = "OLED";
	static String info; //���� ����� �����ϴ� ���
	
	static { //���� ����� ����� ���
	info = company + "-" + model;
	}
	
	void method1(int getpay) { //instance �޼ҵ�
		this.pay = getpay;
		this.color = "����";
		System.out.println(this.pay + ", " + this.color + info); //instance�ȿ��� staticȣ���� �ƹ��͵� �Ƚ��ְ� ���� ���°� �����ϴ�.
		 														 //�ν��Ͻ� ��� �ȿ��� ���� ����� ����� �� �ִ�.
	}
	
	static void method2() { //static �޼ҵ�
		System.out.println(info); //�ν��Ͻ� �޼ҵ�� ��ü�� �����Ǿ߸� �� �� �־ �����޼ҵ忡�� �ν��Ͻ��޼ҵ�� ȣ����Ѵ�.
								  //���� ����ȿ��� �ν��Ͻ� ����� ����� �� ����.
	}
}
