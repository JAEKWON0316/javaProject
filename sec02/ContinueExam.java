package sec02;

public class ContinueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			if((i % 2) == 1) { //Ȧ���϶���
				continue; //�ѱ���
			}
			System.out.println(i);
		}
	}

}
