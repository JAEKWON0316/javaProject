package sec15;

public class Singleton {
	//필드 private 접근 권한을 갖는 정적 필드 선언으로 초기화.
	private static Singleton singleton = new Singleton(); //이 클래스안에 탑재된(static) 밖에서는 못쓰는(private)로 필드생성
	//생성자는 private로 외부 접근을 막음
		private Singleton() {
			String str = "싱글톤객체";
		}
	//public 권한을 갖는 메소드를 만들어 필드를 사용
		public static Singleton getInstance() {
			return singleton;
		}
}
