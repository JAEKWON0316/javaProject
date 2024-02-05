package sec02;

public class MultipleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		for(i=1; i < 10; i++) {
			System.out.println("---구구단" + i + "단---");
			for(j=1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			System.out.println();
		}
		
	}

}
