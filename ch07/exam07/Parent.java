package ch07.exam07;

public class Parent {
		 public String nation;
		 
		 public Parent() {
		  this("대한민국"); //this()는 같은 클래스의 다른 생성자를 호출할 때 사용한다.
		  System.out.println("Parent() call");
		 }
		 
		 public Parent(String nation) {
		  this.nation = nation; //위에 생성자에서 대한민국을 받음
		  System.out.println("Parent(String nation) call");
		 }
}
