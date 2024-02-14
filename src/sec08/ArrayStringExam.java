package sec08;

public class ArrayStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = new String[3];
		
		strArr[0] = "java";
		strArr[1] = "java";
		strArr[2] = new String("java");
		
		System.out.println("0번 : " + strArr[0]);
		System.out.println("1번 : " + strArr[1]);
		System.out.println("2번 : " + strArr[2]);
		
		System.out.println(strArr[0] == strArr[1]); //같은 객체의 주소를 참조 true
		System.out.println(strArr[0] == strArr[2]); //2번 객체는 다른 주소에 생성됨. false
		
		System.out.println(strArr[0].equals(strArr[2])); //문자열의 같음, 다름은 equals()로 비교
		
	}

}
