package sec04;

public class NullPointExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = null;
		//num[0] = 20;   -> NullPointerException 발생
		
		//String str = null;
		//System.out.println("총 문자의 수는" + str.length() + "입니다."); -> NullPointerException 발생
		String str = "홍길동";
		str = "김철수";
		str = null; //이렇게 되면 str은 참조할 주소를 잊어버리게 됨.
		
	}

}
