package sec09;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter5Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length); //전체 배열의 개수3개
		System.out.println(array[2].length);//3번째 배열의 길이 안에 5개
		
		//7. 
		int[] array2 = {1, 5, 3, 8, 2};
		int x = 0;
		for(int i = 1; i < array2.length; i++) {
			if(array2[i] > array2[i-1]) {
				x = array2[i];
			}
		}
		int max = 0;
		for(int i = 0; i < array2.length; i++) {
			if(max < array2[i]) {
				max = array2[i];
			}
		}
		System.out.println("최대값은 : " + x);
		System.out.println("최대값은 : " + max);
		
		//8.
		int[][] array3 = {
				{95, 83},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int stu = 0;
		for(int i = 0; i < array3.length; i++) {
			stu += array[i].length;
			for(int j = 0; j < array3[i].length; j++) {
				sum += array3[i][j];
			}
		}
		System.out.println(sum);
		double avg = (double) sum / stu;
		System.out.println(avg);
		
		//9.
		Scanner sc = new Scanner(System.in);
		//System.out.println("학생 수를 입력해주세요:");
		//int snum = sc.nextInt();
		//System.out.println("점수를 입력해주세요:");
		//int score = sc.nextInt();
		boolean test = true;
		int[] scores = null;
		int studentNumber = 0;
		while(test) {
			
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택> ");
			String check = sc.nextLine();
			int checkInt = Integer.parseInt(check);
			
			switch(checkInt){
				case 1:
					System.out.println("학생수> ");
					//num = new int[] {sc.nextInt()};
					studentNumber = Integer.parseInt(sc.nextLine());
					//studentNumber = sc.nextInt();
					scores = new int[studentNumber]; //학생수만큼의 점수 배열을 만들어 놓는다.
					break;
				case 2:
					for(int i = 0 ; i < scores.length; i++) {
						System.out.println("점수입력> ");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
					break;
				case 3:
					for(int i=  0; i < scores.length; i++) {
						System.out.print(scores[i] + ",");
					}
					System.out.println("입력된 점수 :" + Arrays.toString(scores)); //배열값을 String으로 한 번에 뿌려주는 함수
					
					break;
				case 4:
					int max2 = 0;
					int sum2 = 0;
					double avg2 = 0.0;
					for(int i = 0; i < scores.length; i++) {
						max2 = (max2 < scores[i]) ? scores[i] : max2;
						sum2 += scores[i];
					}
					avg2 = (double) sum2 / studentNumber;
					System.out.println("최고 점수 : " + max2 + "점");
					System.out.println("평균 점수 : " + avg2 + "점");
					break;
					
				case 5:
					test = false;
					
				default:
					test = false;
			}
			
		}
		System.out.println("**************************");
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("**************************");
		
	}

}
