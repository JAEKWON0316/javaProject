package chapter6;

public class Member {
	//필드
	String name;
	String id;
	String password;
	int age;
	//생성자
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	Member(){
		
	}
	//메소드
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
