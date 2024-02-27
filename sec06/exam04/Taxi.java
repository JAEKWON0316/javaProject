package sec06.exam04;

public class Taxi extends Vehicle{
	@Override //ctrl + space를 누르면 힌트가 나와서 바로 오러바리딩 가능
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("택시가 달립니다.");
	}
}
