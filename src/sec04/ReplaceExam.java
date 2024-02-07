package sec04;

public class ReplaceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
		String newStr = str.replace("자바", "java");
		System.out.println(newStr);
				
	}

}
