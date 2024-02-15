package sec05;

public class StudentExam {

	public static void main(String[] args) { //실행 클래스
		// TODO Auto-generated method stub
		Student s1 = new Student(); //클래스 객체화 한것을 변수에 받아준다.
		System.out.println("s1 변수가 Student 객체를 참조한다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조한다.");
		// s1과 s2변수가 스택 영역에 생성되고 힙영역에 Student객체가 따로 따로 생성된다.
	}

}
