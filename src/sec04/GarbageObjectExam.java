package sec04;

public class GarbageObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "����"; //�������� "����"�̶�� ��ü�� �����ǰ� �ּҰ� hobby�� �Ҵ�.
		hobby = null; //���࿡ �ش��ϴ� String ��ü�� �����Ⱑ ��
		
		String bestCar = "����Ƽ��";
		String worstCar = bestCar; //bestCar�� ����� ����Ƽ�� ��ü ������ worstCar�� �Ҵ�
		bestCar = null; //"����Ƽ��"�� ��ü ��Ȳ��?? "����Ƽ��"�� �����Ⱑ �ƴϴ�.�ּҰ��� �ִ�.
		
		System.out.println(worstCar);
	}

}
