package sec07;

public class MultiArrayCreateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� �迭 ����
		int[][] scores = {
				{15, 25, 35},
				{50, 70, 30, 40, 90}
		};
		//�迭�� ����
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		//ù ���� ���� �� ��° �л� ������?
		//�� ��° ���� �� ��° �л� ������?
		//ù ��° ���� ��� ������ ?
		//�� ��° ���� ��� ������ ?
		
		System.out.println("ù ���� ���� �� ��° �л� ������: " + scores[0][2]);
		System.out.println("ù ���� ���� �� ��° �л� ������: " + scores[1][1]);
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < scores[0].length; i++) {
			sum1 += scores[0][i];
		}
		int avg1 = sum1 / scores[0].length;
		System.out.println("ù ��° ���� ����� : " + avg1);
		for(int i = 0; i < scores[1].length; i++) {
			sum2 += scores[1][i];
		}
		int avg2 = sum2 / scores[1].length;
		System.out.println("�� ��° ���� ����� : " + avg2);
		
		//��ü �����?
		int totalSum = 0;
		int totalStudent = 0;
		for(int i = 0; i < scores.length; i++) { //���� �� ��ŭ �ݺ��Ѵ�.
			totalStudent += scores[i].length; //�� ���� �л����� ���Ѵ�.
			for(int j =0; j < scores[i].length; j++) { // �ش� ���� �л� �� ��ŭ �ݺ��Ѵ�.
				totalSum += scores[i][j]; //�л� ������ �ջ��Ѵ�.
			}
			
		}
		System.out.println(totalSum);
		double tclassAvg = (double) totalSum / totalStudent;
		System.out.println(tclassAvg);
		
		
	}

}
