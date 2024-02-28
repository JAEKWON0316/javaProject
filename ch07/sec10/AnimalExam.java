package ch07.sec10;

public class AnimalExam {
	
	//다형성을 이용해 출력
	public static void animalSound(Animal animal) {  //여기 매개변수에는 Dog에서 만든객체와 Cat에서 만든객체가 들어감
		animal.sound();
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); Animal은 abstract이기 때문에(추상 클래스) 객체화 불가능 자식클래스에서 해줘야함
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.breathe(); //상속받은 animal 메소드 호출
		cat.sound(); //부모 추상클래스에서 선언만 하고 cat(자식클래스)에서 재정의한 오버라이드한 메소드 실행
		dog.breathe(); //상속받은 animal 메소드 호출
		dog.sound(); //부모 추상클래스에서 선언만 하고 cat(자식클래스)에서 재정의한 오버라이드한 메소드 실행
		
		animalSound(new Dog()); //Dog에서 만든 객체가 매개변수로
		animalSound(new Cat()); //Cat에서 만든 객체가 매개변수로
		
  }
}
