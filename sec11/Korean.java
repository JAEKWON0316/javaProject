package sec11;

public class Korean {
	//인스턴스 final 필드
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	//생성자 선언
	public Korean(String ssn) {
		this.ssn = ssn; //초기화
		//this.name = name;
	}
	
	//메소드 선언
	void koreanInit(String getName) {
		//this.ssn = getSsn; // final필드는 메소드로 초기화가 불가능하다!
		this.name = getName;
		System.out.println(this.ssn + "-" + this.name);
	}
	
}
