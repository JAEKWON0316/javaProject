package ch07.exam07;

public class Child  extends Parent {
	 public String name;
	 
	 public Child() {
	 //this("ȫ�浿") ���� ���� �ڵ����� �����Ǵ� �⺻ �θ� ������ ȣ�� -> super()
	 this("ȫ�浿"); //this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
	 System.out.println("Child() call");
	 }
	 
	 public Child(String name) {
	 this.name = name;
	 System.out.println("Child(String name) call");
	 }
}
