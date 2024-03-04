package ch08.sec03;

public class Dog implements Animal {
	@Override
	public void cry() {
		System.out.println("강아지는 " + dog + " 웁니당.");
	}
}
