package ch08.sec03;

public class Cat implements Animal {
	@Override
	public void cry() {
		System.out.println("고양이는 " + cat + " 웁니당.");
	}
}
