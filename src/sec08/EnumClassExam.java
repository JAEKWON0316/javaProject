package sec08;

import java.util.Calendar;

public class EnumClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = null;
		//��ǻ�Ϳ� �ִ� ��¥, ����, �ð� ���� �������� java.util.Calendar�� �̿��Ѵ�.
		//java.util.GregorianCalendar
		//Week today = Week.WENDESDAY; //�̷��� enum�ȿ� ���� ������ �� �ִ�.(���� Ÿ���� �� �빮�ڸ� ����.)
		//enum(����Ÿ��)�� �빮�ڷ� ����. ���մܾ��� ��� ������ũǥ����� �̿��Ѵ�.(EX: YEAR_MONTH)
		Calendar now = Calendar.getInstance(); //now�� ������ Calendar ����(Instance)�� �ִ´�.
		
		int year = now.get(Calendar.YEAR); //���� �⵵
		int month = now.get((Calendar.MONTH) +1); //�� (0~11)
		int day = now.get(Calendar.DAY_OF_MONTH); //��
		int week = now.get(Calendar.DAY_OF_WEEK); //���� (1~7);
		int hour = now.get(Calendar.HOUR); //�ð�
		int minute = now.get(Calendar.MINUTE); //��
		int second = now.get(Calendar.SECOND); //��
		
		//���ڸ� ���Ż���� ��ȯ�ؼ� ������ ����
		switch(week) {
		case 1:
			today = Week.�Ͽ���; 
					break;
		case 2:
			today = Week.������; 
					break;
		case 3:
			today = Week.ȭ����; 
					break;
		case 4:
			today = Week.������; 
					break;
		case 5:
			today = Week.�����; 
					break;
		case 6:
			today = Week.�ݿ���; 
					break;
		case 7:
			today = Week.�����; 
					break;
		}
		System.out.println(today);
		if(today == Week.�Ͽ���) {
			System.out.println("�Ͽ��Ͽ� �౸�� ���ϴ�.");
		}
		else if(today == Week.������) {
			System.out.println("�ڹٰ��θ� ��� �մϴ�.");
		}
		else {
			System.out.println("�ٸ� ���Ͽ��� �ڹ� ���θ� �մϴ�.");
		}
	}

}
