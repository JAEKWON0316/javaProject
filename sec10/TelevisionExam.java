package sec10;

public class TelevisionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//info를 출력하시오.
		System.out.println(Television.info); //정적멤버니 바로 호출가능
		//static 메소드 출력
		Television.method2();
		
		//instance 메소드 출력
		Television tv = new Television(); //Television 객체를 생성해서 출력해줘야 함.
		
		System.out.println(tv.pay); //정적필드출력
		
		tv.method1(50000000);
	}

}
