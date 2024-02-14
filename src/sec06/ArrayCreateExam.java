package sec06;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열을 선언과 동시에 생성
		String[] season = {"String", "Summer", "Fall", "Winter"}; //java에서 배열 변수는 {}로 정해준다.
		
		season[1] = "여름";
		for(int i = 0; i <season.length; i++) {
		System.out.println(season[i]);
		}
		
		int[] scores = { 83, 95, 75 };
		int sum = 0;
		//for문을 이용하여 총합과 평균을 구하라.
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length; //우변도 강제타입 변환을 해줘야한다. -> 우변은 모두 정수타입이기때문에
		System.out.println("평균 : " + avg);
	}

}
