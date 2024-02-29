package ch08.sec03;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("강아지는 총 " + Animal.dogs + "마리 입니다.");
		System.out.println("강아지는 총 " + Animal.cats + "마리 입니다.");
		
		Animal ani;
		ani = new Dog();
		ani.cry();
		
		ani = new Cat();
		ani.cry();
	}

}
