package sec06.exam03;

public class ChildExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڽ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ
		Parent parent = new Child(); //�ڽİ�ü�� �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ
		
		//Parent Ÿ������ ���
		parent.field = "������1";
		parent.method1();
		parent.method2();
		
		//parent.field2;  //�� �ΰ��� �θ�Ÿ������ �����߱� ������ �ڽĿ� �־ ���Ұ���
		//parent.method3(); 
		
		//�ڽ�Ŭ���� Ÿ������ ���� Ÿ�Ժ�ȯ
		Child child = (Child) parent; //�ٽ� ChildŸ������ ���� Ÿ�Ժ�ȯ
		child.field = "������1";
		child.method1();
		child.method2();
		
		child.field2 = "������2";  
		child.method3();
	}

}
