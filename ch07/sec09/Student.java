package ch07.sec09;

public class Student extends Person {
	     //필드
		 public int studentNo;
		 
		 //생성자 선언
		 public Student(String name, int studentNo) {
			 super(name); //부모가 name값을 받고있으니 부모에서 초기화
			 this.studentNo = studentNo;
		 }
		 
		 //메소드 선언
		 public void study() {
			 System.out.println("공부를 합니다.");
		 }
}
