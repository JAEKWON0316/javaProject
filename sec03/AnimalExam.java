package ch08.sec03;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������� �� " + Animal.dogs + "���� �Դϴ�.");
		System.out.println("�������� �� " + Animal.cats + "���� �Դϴ�.");
		
		Animal ani;
		ani = new Dog();
		ani.cry();
		
		ani = new Cat();
		ani.cry();
	}

}
