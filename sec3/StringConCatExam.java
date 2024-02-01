package sec3;

public class StringConCatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자연산
		int res1 = 10 + 2 + 8; //int 정수형 20
		System.out.println(res1);
		
		//결합 연산
		String res2 = 10 + 2 + "8";  //문자열 128 연산은 왼쪽으로 오른쪽으로 더해지기 때문에 첫 왼쪽 2개는 합쳐진다.
		System.out.println(res2);    //즉, 문자열이 나오면 그 뒤로부터 문자열로 다 들어간다.
		
		int resInt = Integer.parseInt(res2); //128문자열을 정수형 128로 받아서 변수에 저장
		int resRes = res1 + resInt; // 정수형 20 + 정수형 128
		System.out.println(resRes); //정수형 148 출력!!
		String resString = String.valueOf(resRes); //정수형 148을 문자열로 변환해서 변수값에 저장
		System.out.println(resString); //문자열 148 출력!!
		System.out.println(resString.getClass().getName()); //문자열 타입확인
		
		
		
		String res3 = 10 + "2" + 8;  //문자열 1028
		System.out.println(res3);
		
		String res4 = "10" + 2 + 8; //문자열 1028  2+8 10 으로 안나온다 왜? 앞에 이미 문자열로 받았기 때문에.
		System.out.println(res4);
		
		String res5 = "10" + (2 + 8); //문자열 1010
		System.out.println(res5);
	}

}
