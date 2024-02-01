package sec3;

public class ValScopeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1 > 10) { //자바는 스코프안에서만 변수가 잡힘.
			int v2 = v1 - 10; //v2변수는
		} // --------여기까지 밖에 못쓴다.---------
		//int v3 = v1 + v2 + 5; //v2변수가 사용된 스코프 밖에 있기 때문에 v2변수를 사용할 수 없어서 컴파일 에러.
	  System.out.println("1번 텍스트"); //개행처리(줄바꿈)
	  System.out.println("2번 텍스트");
	  
	  System.out.printf("이름 : %s", "홍 길동 \r");
	  System.out.printf("나이 : %d \r", 25);
	  
	  System.out.printf("이름 : %s 나이 :%d", "홍 길동", 25);
	}
}
