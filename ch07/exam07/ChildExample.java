package ch07.exam07;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		//Child는 Parent를 상속하고 있는 클래스로 객체 생성 시, Parent 객체가 생성된다.
		//그리고 Parent의 Default(매개변수없는) 생성자 안에는 자신의 생성자에 String Parameter 값을 전달해서
		//호출하는 소스코드가 존재하기 때문에 this("대한민국")으로 String nation이 매개변수로 들어있는 생성자부터 실행
		//즉, Parent(String nation) call
		//Parent() call
		//Child(String name) call
		//Child() call
		//순으로 호출된다.
	}

}

