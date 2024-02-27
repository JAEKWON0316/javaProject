package sec06.exam04;

public class DriveExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		//매개값을 이용하여 다형성 구현
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
	}

}
