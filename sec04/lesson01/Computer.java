package sec04.lesson01;

public class Computer extends Calculator{
	
	@Override
	public double areaCircle(double r){ //오버라이드 부모객체에 있는걸 자식객체가 가져다 쓰는것
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
