package chapter6;

public class MemberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member user1 = new Member("홍길동", "hong");
		System.out.println("이름은 " + user1.name + " id는 " + user1.id);
		Member mem = new Member();
		boolean result = mem.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		mem.logout("hong");;
	}

}
