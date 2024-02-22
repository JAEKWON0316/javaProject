package sec11;

public class Earth {
	//상수로 earth_radius를 선언하고 6400을 대입
	static final int earth_radius = 6400; //지구의 반지름
	//상수 더블타입으로 earth_surface_area를 선언하고 지구의 원주율을 대입한다.
	static final double earth_surface_area;
	//정적블럭을 이용하여 초기화
	static {
		earth_surface_area = 4 * Math.PI * earth_radius * earth_radius;
	}
	

}
