package chapter6;

public class MemberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member user1 = new Member("ȫ�浿", "hong");
		System.out.println("�̸��� " + user1.name + " id�� " + user1.id);
		Member mem = new Member();
		boolean result = mem.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		mem.logout("hong");;
	}

}
