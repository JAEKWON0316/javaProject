package ch07.sec09;

public class Student extends Person {
	     //�ʵ�
		 public int studentNo;
		 
		 //������ ����
		 public Student(String name, int studentNo) {
			 super(name); //�θ� name���� �ް������� �θ𿡼� �ʱ�ȭ
			 this.studentNo = studentNo;
		 }
		 
		 //�޼ҵ� ����
		 public void study() {
			 System.out.println("���θ� �մϴ�.");
		 }
}
