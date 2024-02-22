package chapter6;

public class ShopService {
	
	//�̱��� ���� ����� ���
	
	//private ���� ������ ���� �ʵ� ����� �ʱ�ȭ
	private static ShopService singleton = new ShopService();
	
	//private ���� ������ ���� ������ ����
	private ShopService() {
		
	}
	//public ���� ������ ���� �޼ҵ� ����
	public static ShopService getInstance() {
		return singleton;
	}
}
