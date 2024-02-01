package class01;
import java.util.Scanner; //스캐너 받기위한 자바 라이브러리 임포트

public class InfinityAndNanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 5;
		//double y = 0.0;
		//double z = x / y;
		//System.out.println(z);
		//System.out.println(z + 1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("x값의 숫자를 입력하세요."); 
		//String strX = sc.nextLine();    ==>스트링 타입으로 받아서 int형으로 변환하는법
		// int x = Integer.parseInt(strX); 
		int x = sc.nextInt(); //Scanner에서 바로 Int로 받는법.
		System.out.println("y값의 숫자를 입력하세요.");
		double y = sc.nextDouble();
		
		double z = x / y;

		//예외처리                                                                                 
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값을 계산할 수 없음.");
		}
		else {
			System.out.println(z + 2);
		}
		sc.close();
	}
}