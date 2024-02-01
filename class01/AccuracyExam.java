package class01;

public class AccuracyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사과가 1있다. 이 사과를 10조각으로 나눈다.
		 * 한 조각은 0.1
		 * 7조각을 먹고 남은 조각은 몇 인가?
		 * 0.3
		 */
		int apple = 1;
		double onePeace = 0.1;
		int number = 7;
		
		double resultApple = apple - number * onePeace;
		System.out.println("사과 한개에서 남은 양은 : " + resultApple +"입니다"); //근사치 0.29999999......나온다
		
		//정확한 계산을 하는법(정수형으로 변환 후 연산)
		int totalPeace = apple * 10;
		int resultApple2 = totalPeace - number;
		System.out.println("사과 10조각 중에 남은 조각은 : " + resultApple2);
		System.out.println("사과 한 개에 남은 양은 : " + resultApple2 / 10.0); //나눌 때 실수형을 넣거나 실수형으로 나눠주면 실수형으로 나온다.
	}

}
