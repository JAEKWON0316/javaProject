package sec3;

import java.util.Scanner;

public class Scanner2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int data = 0;
		while(true){ //���ѷ���
		System.out.println("���ڸ� �Է��ϼ���. ");
		String sc = scanner.nextLine();
		int x = Integer.parseInt(sc);
		data += x;
		
		if(x == 0) {  //0�� ���� �� break(��������)
			break;
		}
		System.out.println("���� " + data);
		}
		System.out.println("--------- �� ---------");
	}

}
