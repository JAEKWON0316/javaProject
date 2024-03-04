package ch11.sec04;

public class ResourceOpenClose implements AutoCloseable{ //자바에 기본 탑재돼있는 인터페이스 상속
    //필드
	private String name;
	
	//생성자
	public ResourceOpenClose(String name) {
		this.name = name;
		System.out.println(name + "열기");
	}
	public String read1() {
		System.out.println(name + "읽기");
		return "100";
	}
	public String read2() {
		System.out.println(name + "읽기");
		return "홍길동";
	}
	@Override
	public void close() throws Exception{ //에러 떠넘기기
		System.out.println(name + "닫기");
	}
}
