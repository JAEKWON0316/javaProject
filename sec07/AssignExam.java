package sec07;

public class AssignExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int result = 0;
//		result += 10;
//		System.out.println(result); //0+10
//		
//		result -= 5;
//		System.out.println(result); //10-5
//		
//		result *= 3;
//		System.out.println(result); //5*3
//		
//		result /= 5;
//		System.out.println(result); //15/5
//		
//		result %= 3;
//		System.out.println(result); // 3 & 3 ==0
		
		// score가 85일 때 90이상이면 A 80이상이면 B 그 아래면 C
		// score 점은 00 등급입니다.로 출력하라.
		int score =85;
		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'c';
		System.out.println(score + "점은" + grade + "등급입니다.");
//		if (score >= 90) {
//			System.out.println("A");
//		}
//		else if(score < 90 && score >= 80) {
//			System.out.println("B");
//		}
//		else {
//			System.out.println("C");
//		}
	}

}
