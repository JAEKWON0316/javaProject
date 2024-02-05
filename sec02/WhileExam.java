package sec02;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		while(i < 10) {
			System.out.println("********** " + i + "단 **********");
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
			}
			j = 1; //j를 다시 1로 만들어줘야 while(j < 10)문이 루프를 돌기 때문에 초기화 시켜줘야한다!
			i++;
		}
	}

}
