package sec11;

public class Korean {
	//�ν��Ͻ� final �ʵ�
	final String nation = "���ѹα�";
	final String ssn;
	
	String name;
	
	//������ ����
	public Korean(String ssn) {
		this.ssn = ssn; //�ʱ�ȭ
		//this.name = name;
	}
	
	//�޼ҵ� ����
	void koreanInit(String getName) {
		//this.ssn = getSsn; // final�ʵ�� �޼ҵ�� �ʱ�ȭ�� �Ұ����ϴ�!
		this.name = getName;
		System.out.println(this.ssn + "-" + this.name);
	}
	
}
