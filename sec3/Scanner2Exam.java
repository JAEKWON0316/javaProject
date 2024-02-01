package sec3;

import java.util.Scanner;

public class Scanner2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int data = 0;
		while(true){ //무한루프
		System.out.println("숫자를 입력하세요. ");
		String sc = scanner.nextLine();
		int x = Integer.parseInt(sc);
		data += x;
		
		if(x == 0) {  //0을 쳤을 때 break(빠져나감)
			break;
		}
		System.out.println("합은 " + data);
		}
		System.out.println("--------- 끝 ---------");
	}

}
