package ch07.sec09;

public class InstanceofExam {
			//메소드 -main()에서 바로 호출하기 위해 정적(static)으로 변환
			public static void personInfo(Person person) { //매개변수로 person이란 클래스를 넣어줌(if에서 비교됨)
				System.out.println("name : " + person.name);
				person.walk();
		
			
			//Person이 Student 타입인지 확인
			if(person instanceof Student) { //여기서 Person person 매개변수의 타입을 확인
				//Student 객체일 경우 강제 타입 변환
				Student student = (Student) person;
				//Student 객체만 가지고 있는 필드 및 메소드 사용
				System.out.println("studentNo : " + student.studentNo);
				student.study();
			}
			/*
			 * java 12 이상일 경우
			 * if(person instanceof Student student){
			 * System.out.println("studentNo : " + student.studentNo);
			 * student.study();
			 * }
			 * 이렇게 바로 작업가능(강제타입변환없이)
			 */
		  }
			
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Person 객체를 매개값으로 제공하고 바로 personInfo() 메소드 호출
			Person p1 = new Person("홍길동"); //Person타입의 person생성자 실행
			personInfo(p1);      
			
			System.out.println();
			
			Person p2 = new Student("안철수", 10); //Person타입의 student 생성자 실행
			personInfo(p2);
			
		}
}

