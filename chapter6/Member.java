package chapter6;

public class Member {
	//�ʵ�
	String name;
	String id;
	String password;
	int age;
	//������
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	Member(){
		
	}
	//�޼ҵ�
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	void logout(String id) {
		System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
	}
}
