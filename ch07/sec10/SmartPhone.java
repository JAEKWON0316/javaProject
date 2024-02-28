package ch07.sec10;

public class SmartPhone extends Phone {
	//생성자
	SmartPhone(String owner){
		super(owner); //부모가 이미 초기화 하고 있어서 super부모 생성자로 초기화 해야함
	}
		//메소드
	void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}
}
