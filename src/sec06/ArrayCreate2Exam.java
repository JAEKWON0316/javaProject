package sec06;

public class ArrayCreate2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 변수만 선언
		int[] scores;
		
		//배열 변수에 국어, 영어, 수학 점수를 대입
		scores = new int[] {90, 95, 94}; //new를 써서 힙영역에 번지를 만들어줘야한다.
		for (int i = 0; i < scores.length; i ++) {
			//System.out.println(scores[i]);
		}
		printScores(new int[] {67, 66, 80});
	}
	//printScores 라는 메소드를 선언
	public static void printScores(int[] scores) { //void는 리턴타입X
		//매개변수가 참조하는 배열의 항목을 출력
		for(int i = 0; i < 3; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}
}
