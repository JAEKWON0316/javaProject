package sec06;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� ����� ���ÿ� ����
		String[] season = {"String", "Summer", "Fall", "Winter"}; //java���� �迭 ������ {}�� �����ش�.
		
		season[1] = "����";
		for(int i = 0; i <season.length; i++) {
		System.out.println(season[i]);
		}
		
		int[] scores = { 83, 95, 75 };
		int sum = 0;
		//for���� �̿��Ͽ� ���հ� ����� ���϶�.
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / scores.length; //�캯�� ����Ÿ�� ��ȯ�� ������Ѵ�. -> �캯�� ��� ����Ÿ���̱⶧����
		System.out.println("��� : " + avg);
	}

}
