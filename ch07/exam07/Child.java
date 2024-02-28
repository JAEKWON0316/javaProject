package ch07.exam07;

public class Child  extends Parent {
	 public String name;
	 
	 public Child() {
	 //this("홍길동") 실행 전에 자동으로 생성되는 기본 부모 생성자 호출 -> super()
	 this("홍길동"); //this()는 같은 클래스의 다른 생성자를 호출할 때 사용한다.
	 System.out.println("Child() call");
	 }
	 
	 public Child(String name) {
	 this.name = name;
	 System.out.println("Child(String name) call");
	 }
}
