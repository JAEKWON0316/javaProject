package ch11.sec04;

public class ResourceOpenClose implements AutoCloseable{ //�ڹٿ� �⺻ ž����ִ� �������̽� ���
    //�ʵ�
	private String name;
	
	//������
	public ResourceOpenClose(String name) {
		this.name = name;
		System.out.println(name + "����");
	}
	public String read1() {
		System.out.println(name + "�б�");
		return "100";
	}
	public String read2() {
		System.out.println(name + "�б�");
		return "ȫ�浿";
	}
	@Override
	public void close() throws Exception{ //���� ���ѱ��
		System.out.println(name + "�ݱ�");
	}
}
