package sec08;

public class AdvancedForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 95, 71, 35, 69, 77, 88, 15 };
		
		//�� �迭�� ��ü ���� ���� for���� �̿��Ͽ� ���϶�.
		//�׸��� ��յ� ���϶�.
		int sum = 0;
		double avg;
		for(int x : scores) {
			sum += x;
		}
		System.out.println("���� : " + sum);
		avg = (double) sum / scores.length;
		System.out.println("��� : " + avg);
	}

}
