package ch07.sec09;

public class InstanceofExam {
			//�޼ҵ� -main()���� �ٷ� ȣ���ϱ� ���� ����(static)���� ��ȯ
			public static void personInfo(Person person) { //�Ű������� person�̶� Ŭ������ �־���(if���� �񱳵�)
				System.out.println("name : " + person.name);
				person.walk();
		
			
			//Person�� Student Ÿ������ Ȯ��
			if(person instanceof Student) { //���⼭ Person person �Ű������� Ÿ���� Ȯ��
				//Student ��ü�� ��� ���� Ÿ�� ��ȯ
				Student student = (Student) person;
				//Student ��ü�� ������ �ִ� �ʵ� �� �޼ҵ� ���
				System.out.println("studentNo : " + student.studentNo);
				student.study();
			}
			/*
			 * java 12 �̻��� ���
			 * if(person instanceof Student student){
			 * System.out.println("studentNo : " + student.studentNo);
			 * student.study();
			 * }
			 * �̷��� �ٷ� �۾�����(����Ÿ�Ժ�ȯ����)
			 */
		  }
			
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Person ��ü�� �Ű������� �����ϰ� �ٷ� personInfo() �޼ҵ� ȣ��
			Person p1 = new Person("ȫ�浿"); //PersonŸ���� person������ ����
			personInfo(p1);      
			
			System.out.println();
			
			Person p2 = new Student("��ö��", 10); //PersonŸ���� student ������ ����
			personInfo(p2);
			
		}
}

