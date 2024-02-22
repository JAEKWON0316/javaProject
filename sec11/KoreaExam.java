package sec11;

public class KoreaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("123313-123133");//final필드는 필드,생성자에서만 초기화가능
		k1.koreanInit("홍길동"); //일반필드는 메소드포함하여 어디서든 가능
	}

}
