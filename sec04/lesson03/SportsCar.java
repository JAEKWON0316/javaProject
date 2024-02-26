package sec04.lesson03;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10; //Car의 필드를 증가시킴
	}
	
//	@Override
//	public void stop() { //부모에서 stop() 메소드를 final로 정했기 때문에 override 안된다!!.
//		System.out.println("스포츠카를 정지 시킵니다."); 
//	}
	
}
