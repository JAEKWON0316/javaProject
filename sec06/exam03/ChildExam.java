package sec06.exam03;

public class ChildExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자식클래스 객체를 생성하면서 부모타입으로 자동타입변환
		Parent parent = new Child(); //자식객체로 부모타입으로 자동타입변환
		
		//Parent 타입으로 사용
		parent.field = "데이터1";
		parent.method1();
		parent.method2();
		
		//parent.field2;  //이 두개는 부모타입으로 선언했기 때문에 자식에 있어서 사용불가능
		//parent.method3(); 
		
		//자식클래스 타입으로 강제 타입변환
		Child child = (Child) parent; //다시 Child타입으로 강제 타입변환
		child.field = "데이터1";
		child.method1();
		child.method2();
		
		child.field2 = "데이터2";  
		child.method3();
	}

}
