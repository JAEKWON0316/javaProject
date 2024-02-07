package sec04;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홍길동"; //힙영역에 홍길동 주소생성
		String name2 = "홍길동";//힙영역에 있는 홍길동 주소에 생성
		
		String name3 = new String("홍길동"); //객체를 생성해서 했음으로 다른 주소에 생성
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		 
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name2 == name3);
		
		System.out.println(name1.equals(name3)); //그래서 String의 값이 같은지 보려면 equals객체를 써야한다.
		
	}

}
