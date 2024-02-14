package sec05;

public class SplitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습,참조 타입 String을 공부합니다.,김철수";
		//쉼표를 기준으로 문자열 분리
		String[] tks = board.split(","); //split은 배열 타입으로 저장한다
		String str = "번호 : ,제목 : ,내용 : ,이름 : ";
		String[] arr = str.split(",");
		//인데스로 읽어오기
		System.out.println("번호 : " + tks[0]);
		System.out.println("제목 : " + tks[1]);
		System.out.println("내용 : " + tks[2]);
		System.out.println("이름 : " + tks[3]);
		System.out.println("++++++++++++++++");
		System.out.println();
		
		for(int i = 0; i < tks.length; i ++) { 
			//배열의 길이는 length; , 문자열의 길이는 length();
			System.out.print(arr[i]);
			System.out.println(tks[i]);
		}
	}

}
