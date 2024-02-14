package sec07;

public class MultiArrayCreateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 생성
		int[][] scores = {
				{15, 25, 35},
				{50, 70, 30, 40, 90}
		};
		//배열의 길이
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		//첫 번쨰 반의 세 번째 학생 점수는?
		//두 번째 반의 두 번째 학생 점수는?
		//첫 번째 반의 평균 점수는 ?
		//두 번째 반의 평균 점수는 ?
		
		System.out.println("첫 번쨰 반의 세 번째 학생 점수는: " + scores[0][2]);
		System.out.println("첫 번쨰 반의 세 번째 학생 점수는: " + scores[1][1]);
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < scores[0].length; i++) {
			sum1 += scores[0][i];
		}
		int avg1 = sum1 / scores[0].length;
		System.out.println("첫 번째 반의 평균은 : " + avg1);
		for(int i = 0; i < scores[1].length; i++) {
			sum2 += scores[1][i];
		}
		int avg2 = sum2 / scores[1].length;
		System.out.println("두 번째 반의 평균은 : " + avg2);
		
		//전체 평균은?
		int totalSum = 0;
		int totalStudent = 0;
		for(int i = 0; i < scores.length; i++) { //반의 수 만큼 반복한다.
			totalStudent += scores[i].length; //각 반의 학생수를 합한다.
			for(int j =0; j < scores[i].length; j++) { // 해당 반의 학생 수 만큼 반복한다.
				totalSum += scores[i][j]; //학생 점수를 합산한다.
			}
			
		}
		System.out.println(totalSum);
		double tclassAvg = (double) totalSum / totalStudent;
		System.out.println(tclassAvg);
		
		
	}

}
