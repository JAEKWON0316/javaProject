package ch07.exam07;

public class Parent {
		 public String nation;
		 
		 public Parent() {
		  this("���ѹα�"); //this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
		  System.out.println("Parent() call");
		 }
		 
		 public Parent(String nation) {
		  this.nation = nation; //���� �����ڿ��� ���ѹα��� ����
		  System.out.println("Parent(String nation) call");
		 }
}
