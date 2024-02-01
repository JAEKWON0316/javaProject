package sec07;

public class Chapter03Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		//2.
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);
		//3.
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		//4.
		int value = 356;
		System.out.println(value - (value % 100));
		
		//5.
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		
		//6.
		int a = 10;
		int b = 5;
		System.out.println((a > 7) && (b <= 5));
		System.out.println((a%3 == 2) || (y%2 != 1));
		
		//7.
		double i = 5.0;
		double j = 0.0;
		double k = 5 % j;
		if(Double.isNaN(k)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else{
			double result2 = k + 10;
			System.out.println("결과: " + result2);
		}
			
	}
}


