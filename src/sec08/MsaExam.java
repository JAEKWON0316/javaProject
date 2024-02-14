package sec08;

public class MsaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("매개변수의 수가 부족하거나 많습니다.");
			System.exit(0); //프로그램 강제종료
		}
		String snum1 = args[0];
		String snum2 = args[1];
		
		int num1 = Integer.parseInt(snum1); //String타입을 Integer타입으로 변환
		int num2 = Integer.parseInt(snum2);
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}

}
