package chapter6;

public class ShopService {
	
	//싱글톤 패턴 만드는 방법
	
	//private 접근 권한을 갖는 필드 선언과 초기화
	private static ShopService singleton = new ShopService();
	
	//private 접근 권한을 갖는 생성사 선언
	private ShopService() {
		
	}
	//public 접근 권한을 갖는 메소드 선언
	public static ShopService getInstance() {
		return singleton;
	}
}
