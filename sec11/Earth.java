package sec11;

public class Earth {
	//����� earth_radius�� �����ϰ� 6400�� ����
	static final int earth_radius = 6400; //������ ������
	//��� ����Ÿ������ earth_surface_area�� �����ϰ� ������ �������� �����Ѵ�.
	static final double earth_surface_area;
	//�������� �̿��Ͽ� �ʱ�ȭ
	static {
		earth_surface_area = 4 * Math.PI * earth_radius * earth_radius;
	}
	

}
