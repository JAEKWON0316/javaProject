package sec06.exam04;

public class DriveExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		//�Ű����� �̿��Ͽ� ������ ����
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
	}

}
