package class01;

public class SingleOpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = -100;
//		x = -x;
//		System.out.println("x : " + x);
//		
//		byte b = 100;
//		//byte y = -b; //������ ���� why? -��ȣ�� �����̱� ������ ����� int�� �ؾ��Ѵ�.
//		int y = -b;
//		System.out.println("y + " + y);
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x = " + x);	
		System.out.println("-----------");
		
		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("-----------");
		
		
		z = ++x; //x�� ���������ڷ� ���� +1 ���ش����� z�� ���Կ���
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("-----------");
		
		z = x++;
		System.out.println("z = " + z); //z�� x�������� ���� �־ 13
		System.out.println("x = " + x); //x�� z�� 13������ ��������ż� 14
		System.out.println("-----------");
		
		z = ++x + y++;
		System.out.println("z = " + z); //13+1 + 8 == 22
		System.out.println("x = " + x);
		System.out.println("y = " + y); // z�� ���� ������ y++���������� 9
		
	}

}
