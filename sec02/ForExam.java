package sec02;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum = 0;
		for(i=1; i <= 100; i++) {
			sum += i; //sum에다가 1~100까지의 i값을 계속 더해줌.
		}
		System.out.println("1부터 100까지의 합은 :" + sum + "입니다");
	}

}
