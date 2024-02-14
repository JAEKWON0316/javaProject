package sec08;

public class AdvancedForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 95, 71, 35, 69, 77, 88, 15 };
		
		//이 배열의 전체 합을 향상된 for문을 이용하여 구하라.
		//그리고 평균도 구하라.
		int sum = 0;
		double avg;
		for(int x : scores) {
			sum += x;
		}
		System.out.println("총합 : " + sum);
		avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
